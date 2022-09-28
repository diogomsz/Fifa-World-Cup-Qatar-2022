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

		String linha = MyIO.readLine();
		
		Jogo[] vetorJogo = new Jogo[400];
				
		for(int i = 0; i < vetorJogo.length; i++) {
			
			if(linha == "FIM") {
				break;
			}
			
			System.out.println(linha);
			
			String[] vetorDados = linha.split("#");
			Jogo jogo = new Jogo();
			
			jogo.setAno(Integer.parseInt(vetorDados[0]));
			jogo.setEtapa(vetorDados[1]);
			jogo.setDia(Integer.parseInt(vetorDados[2]));
			jogo.setMes(Integer.parseInt(vetorDados[3]));
			jogo.setSelecao1(vetorDados[4]);
			jogo.setPlacarSelecao1(Integer.parseInt(vetorDados[5]));
			jogo.setPlacarSelecao2(Integer.parseInt(vetorDados[6]));
			jogo.setSelecao2(vetorDados[7]);
			jogo.setLocal(vetorDados[8]);
			
			vetorJogo[i] = jogo;
			
			linha = MyIO.readLine();
		}
		
		String quantidadeDeLinhas = MyIO.readLine();
		int linhas = Integer.parseInt(quantidadeDeLinhas);
		int i = 0;
		
		System.out.println(vetorJogo.length);
		
		while(i < linhas) {
			String linhaPesquisa = MyIO.readLine();
			String[] vetorPesquisa = linhaPesquisa.split(";");
			
			String data = vetorPesquisa[0];
			String pais = vetorPesquisa[1];
			
			
			String[] vetorData = data.split("/");
			
			int auxDia = Integer.parseInt(vetorData[0]);
			int auxMes = Integer.parseInt(vetorData[1]);
			int auxAno = Integer.parseInt(vetorData[2]);
		
			for(int j = 0; j < vetorJogo.length; j++) {
				
				if(auxDia == vetorJogo[j].getDia() && auxMes == vetorJogo[j].getMes() && auxAno == vetorJogo[j].getAno() && pais == vetorJogo[i].getSelecao1()) {
					vetorJogo[i].imprimir();
					
					// PAREI AQUI:
					//* PROBLEMA, NAO ESTA IMPRIMINDO OS DADOS DOS JOGOS
				}
			}
			
			i++;
		}
		
	}
	
	public Jogo() {
		
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
	
	public void clone1() {
		// SER� IMPLEMENTADO FUTURAMENTE
	}
	
	public void ler() {		
		
	}
	
	public void imprimir() {
		
		System.out.println("[COPA "+ getAno() +"] [" + getEtapa() + "] "
				+ "[" + getDia() + "/" + getMes() + "] [" + getSelecao1() + " (" + getPlacarSelecao1() + ") "
				+ "x" + " (" + getPlacarSelecao2() + ") " + getSelecao2() + "] [" + getLocal() + "]");
		
	}
}