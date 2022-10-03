public class Jogo {
	private int dia;
	private int mes;
	private int ano;
	private String etapa;
	private String selecao1;
	private String selecao2;
	private int placarSelecao1;
	private int placarSelecao2;
	private String local;
	
	public static void main(String[] args) {
		MyIO.setCharset("UTF-8");
		
		Jogo[] vetorJogo = new Jogo[400];
		String linha = ler();
				
		for(int i = 0; i < vetorJogo.length; i++) {
			
			if(linha.equals("FIM")) {
				break;
			}
			
			String[] vetorDados = linha.split("#");
			
			int ano = Integer.parseInt(vetorDados[0]);
			String etapa = vetorDados[1];
			int dia = Integer.parseInt(vetorDados[2]);
			int mes = Integer.parseInt(vetorDados[3]);
			String selecao1 = vetorDados[4];
			int placar1 = Integer.parseInt(vetorDados[5]);
			int placar2 = Integer.parseInt(vetorDados[6]);
			String selecao2 = vetorDados[7];
			String local = vetorDados[8];
			
			vetorJogo[i] = new Jogo(dia, mes, ano, etapa, selecao1, selecao2, placar1, placar2, local);			
			linha = ler();
		}
		
		int linhas = MyIO.readInt();
		int x = 0;
		
		String[] vetorPesquisa = new String[linhas];
		
		while(x < linhas) {
			String linhaPesquisa = ler();
			
			if(!linhaPesquisa.equals(" ")) {				
				vetorPesquisa[x] = linhaPesquisa;
				x++;
			}
		}
		
		for(int i = 0; i < vetorPesquisa.length; i++) {
			for(int j = 0; j < vetorJogo.length; j++) {
				String[] dadosPesquisa = vetorPesquisa[i].split("[;/]+");
				
				int dia = Integer.parseInt(dadosPesquisa[0]);
				int mes = Integer.parseInt(dadosPesquisa[1]);
				int ano = Integer.parseInt(dadosPesquisa[2]);
				String pais = dadosPesquisa[3];
				
				boolean valorPais = vetorJogo[j].selecao1.equals(pais);
				boolean valorDia = vetorJogo[j].dia == dia;
				boolean valorMes = vetorJogo[j].mes == mes;
				boolean valorAno = vetorJogo[j].ano == ano;
				
				if(valorPais && valorAno && valorMes && valorDia) {						
					vetorJogo[j].imprimir();
				}
			}
		}
	}
	
	public Jogo(int dia, int mes, int ano, String etapa, String selecao1, String selecao2, int placarSelecao1, int placarSelecao2, String local) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);;
		this.setEtapa(etapa);
		this.setSelecao1(selecao1);
		this.setSelecao2(selecao2);
		this.setPlacarSelecao1(placarSelecao1);
		this.setPlacarSelecao2(placarSelecao2);
		this.setLocal(local);
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getEtapa() {
		return this.etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	
	public String getSelecao1() {
		return selecao1;
	}
	public void setSelecao1(String selecao1) {
		this.selecao1 = selecao1;
	}
	
	public String getSelecao2() {
		return selecao2;
	}
	public void setSelecao2(String selecao2) {
		this.selecao2 = selecao2;
	}
	
	public int getPlacarSelecao1() {
		return placarSelecao1;
	}
	public void setPlacarSelecao1(int placarSelecao1) {
		this.placarSelecao1 = placarSelecao1;
	}
	
	public int getPlacarSelecao2() {
		return placarSelecao2;
	}
	public void setPlacarSelecao2(int placarSelecao2) {
		this.placarSelecao2 = placarSelecao2;
	}

	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public Jogo clone() {
		return new Jogo(this.dia, this.mes, this.ano, this.etapa, this.selecao1, this.selecao2, this.placarSelecao1, this.placarSelecao2, this.local);
	}
	
	public static String ler() {
		// Leitura da entrada padrão
		int quantidadeDeLinhas = MyIO.readInt();
		String[] strDados = new String[quantidadeDeLinhas];
		
		String linha = MyIO.readLine();
		
		int i = 0;
		while(i < strDados.length) {
			strDados[i] = linha;
			linha = MyIO.readLine();
			i++;
		}
		
		// for() --> parei neste for
		return "";
	}
	
	public void imprimir() {
		System.out.println("[COPA "+ getAno() +"] [" + getEtapa() + "] "
				+ "[" + getDia() + "/" + getMes() + "] [" + getSelecao1() + " (" + getPlacarSelecao1() + ") "
				+ "x" + " (" + getPlacarSelecao2() + ") " + getSelecao2() + "] [" + getLocal() + "]");
	}
}