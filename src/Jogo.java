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
		
		ler();
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
	
	public static void ler() {
		
		/*
		 * CORRIGIR PROBLEMA DE NULLPOINTEREXCEPTION
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Jogo.imprimir()" because "jogo" is null
		 * at Jogo.ler(Jogo.java:152)
		 * at Jogo.main(Jogo.java:15)
		 * */
		
		int quantidadeDeLinhas = MyIO.readInt();
		String[] vetorPesquisa = new String[quantidadeDeLinhas];
		
		String linha;
		
		int i = 0;
		while(i < vetorPesquisa.length) {
			linha = MyIO.readLine();
			vetorPesquisa[i] = linha;
			i++;
		}
		
		String nomeArquivo = "tmp/partidas.txt";
		
		ArquivoTextoLeitura arquivoPartida = new ArquivoTextoLeitura(nomeArquivo);
		Jogo[] vetorObjeto = new Jogo[vetorPesquisa.length];
		
		int j = 0;
		
		for(int z = 0; z < vetorPesquisa.length; z++) {
			String linhaArquivo = arquivoPartida.ler();
			String dadosDaPesquisa[] = vetorPesquisa[z].split("[;/]+");
			
			int diaPesquisa = Integer.parseInt(dadosDaPesquisa[0]);
			int mesPesquisa = Integer.parseInt(dadosDaPesquisa[1]);
			int anoPesquisa = Integer.parseInt(dadosDaPesquisa[2]);
			String selecaoPesquisa = dadosDaPesquisa[3];
			
			while(linhaArquivo != null) {
				String[] dados = linhaArquivo.split("#");
				
				int ano = Integer.parseInt(dados[0]);
				String etapa = dados[1];
				int dia = Integer.parseInt(dados[2]);
				int mes = Integer.parseInt(dados[3]);
				String selecao1 = dados[4];
				int placar1 = Integer.parseInt(dados[5]);
				int placar2 = Integer.parseInt(dados[6]);
				String selecao2 = dados[7];
				String local = dados[8];
				
				
				if(ano == anoPesquisa && dia == diaPesquisa && mes == mesPesquisa) {
					if(selecao1.equals(selecaoPesquisa)) {						
						vetorObjeto[j] = new Jogo(dia, mes, ano, etapa, selecao1, selecao2, placar1, placar2, local);
						j++;
					}
				}
				
				linhaArquivo = arquivoPartida.ler();
			}
		}
		
		for(Jogo jogo : vetorObjeto) {
			jogo.imprimir();
		}
	}
	
	public void imprimir() {
		System.out.println("[COPA "+ getAno() +"] [" + getEtapa() + "] "
				+ "[" + getDia() + "/" + getMes() + "] [" + getSelecao1() + " (" + getPlacarSelecao1() + ") "
				+ "x" + " (" + getPlacarSelecao2() + ") " + getSelecao2() + "] [" + getLocal() + "]");
	}
}