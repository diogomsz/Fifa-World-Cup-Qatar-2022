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
		
		Jogo[] vetor = ler();
		for(Jogo jogo : vetor) {
			jogo.imprimir();
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
	
	public static Jogo[] ler() {
		// Contando a quantidade de linhas de um arquivos
		ArquivoTextoLeitura fileReadCount = new ArquivoTextoLeitura("tmp/partidas.txt");
		int quantidadeLinha = 0;
		
		String linhaContar = fileReadCount.ler();
		while(linhaContar != null) {
			quantidadeLinha++;
			linhaContar = fileReadCount.ler();
		}
		
		// Preenchendo um vetor de objetos com os dados do arquivo
		String[] dadosArquivo;
		Jogo[] vetorPartida = new Jogo[quantidadeLinha];
		ArquivoTextoLeitura fileReadData = new ArquivoTextoLeitura("tmp/partidas.txt");
		
		int i = 0;
		String linhaDado = fileReadData.ler();
		while(linhaDado != null) {
			dadosArquivo = linhaDado.split("#");
			
			int ano = Integer.parseInt(dadosArquivo[0]);
			String etapa = dadosArquivo[1];
			int dia = Integer.parseInt(dadosArquivo[2]);
			int mes = Integer.parseInt(dadosArquivo[3]);
			String selecao1 = dadosArquivo[4];
			int placarSelecao1 = Integer.parseInt(dadosArquivo[5]);
			int placarSelecao2 = Integer.parseInt(dadosArquivo[6]);
			String selecao2 = dadosArquivo[7];
			String local = dadosArquivo[8];
			
			vetorPartida[i] = new Jogo(dia, mes, ano, etapa, selecao1, selecao2, placarSelecao1, placarSelecao2, local);
			linhaDado = fileReadData.ler();
			i++;
		}
		
		// Lendo a entrada padrao
		int quantidadeDePesquisa = MyIO.readInt();
		String[] dadosPesquisa;
		String linhaPesquisa;
		
		Jogo[] vetorResultado = new Jogo[quantidadeDePesquisa];
		
		int j = 0;
		while(j < quantidadeDePesquisa) {
			linhaPesquisa = MyIO.readLine();
			dadosPesquisa = linhaPesquisa.split("[;/]+");
			
			int dia = Integer.parseInt(dadosPesquisa[0]);
			int mes = Integer.parseInt(dadosPesquisa[1]);
			int ano = Integer.parseInt(dadosPesquisa[2]);
			String selecao1 = dadosPesquisa[3];
			
			for(int indice = 0; indice < vetorPartida.length; indice++) {
				if(dia == vetorPartida[indice].getDia() && mes == vetorPartida[indice].getMes()
						&& ano == vetorPartida[indice].getAno() && selecao1.equals(vetorPartida[indice].getSelecao1())) {
					vetorResultado[j] = vetorPartida[indice];
				}
			}
			
			j++;
		}
		
		return vetorResultado;
	}
	
	
	public void imprimir() {
		System.out.println("[COPA "+ getAno() +"] [" + getEtapa() + "] "
				+ "[" + getDia() + "/" + getMes() + "] [" + getSelecao1() + " (" + getPlacarSelecao1() + ") "
				+ "x" + " (" + getPlacarSelecao2() + ") " + getSelecao2() + "] [" + getLocal() + "]");
	}
}