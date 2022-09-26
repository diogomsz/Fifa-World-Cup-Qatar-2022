// Daniel Bezerra
// Diogo Martins de Assis
// Lucas de Carvalho Barbosa

public class Jogo {
	// 1. Instanciar a classe
	// 2. Executar o metodo ler
	// 3. Executar o metodo imprimir
	
	private int dia;
	private int mes;
	private int ano;
	private String etapa;
	private String selecao1;
	private String selecao2;
	private int placarSelecao1;
	private int placarSelecao2;
	private String local;
	
	/*
	public Jogo() {
		String[] dados = new String[9];
		String textoLinha = ler();
		
		dados = textoLinha.split("#");
		
		this.ano = Integer.parseInt(dados[0]);
		this.etapa = dados[1];
		this.dia = Integer.parseInt(dados[2]);
		this.mes = Integer.parseInt(dados[3]);
		this.selecao1 = dados[4];
		this.placarSelecao1 = Integer.parseInt(dados[5]);
		this.placarSelecao2 = Integer.parseInt(dados[6]);
		this.selecao2 = dados[7];
		this.local = dados[8];
	}
	*/
	
	public void gets() {
		// SERÁ IMPLEMENTADO FUTURAMENTE
	}
	
	public void sets() {
		// SERÁ IMPLEMENTADO FUTURAMENTE
	}
	
	public void clone1() {
		// SERÁ IMPLEMENTADO FUTURAMENTE
	}
	
	public void ler() {
		MyIO.setCharset("UTF-8");
		
		String[] dados = new String[9];
		String textoLinha = MyIO.readLine();
		
		dados = textoLinha.split("#");
		
		this.ano = Integer.parseInt(dados[0]);
		this.etapa = dados[1];
		this.dia = Integer.parseInt(dados[2]);
		this.mes = Integer.parseInt(dados[3]);
		this.selecao1 = dados[4];
		this.placarSelecao1 = Integer.parseInt(dados[5]);
		this.placarSelecao2 = Integer.parseInt(dados[6]);
		this.selecao2 = dados[7];
		this.local = dados[8];
	}
	
	public void imprimir() {
		System.out.println("[COPA "+ this.ano +"] [" + this.etapa + "] "
				+ "[" + this.dia + "/" + this.mes + "] [" + this.selecao1 + " (" + this.placarSelecao1 + ") "
				+ "x" + " (" + this.placarSelecao2 + ") " + this.selecao2 + "] [" + this.local + "]");
	}
}
