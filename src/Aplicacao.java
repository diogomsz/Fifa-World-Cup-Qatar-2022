import java.io.*;

public class Aplicacao {
	public static void main(String[] args) {
		MyIO.setCharset("UTF-8");
		
		String[] vetorPesquisa = Jogo.ler();
		Jogo[] vetorPartida = Jogo.lerArquivo();
		
		Jogo[] vetorSaida = Jogo.fazerPesquisa(vetorPesquisa, vetorPartida);
		for(Jogo partida : vetorSaida) {
			partida.imprimir();
		}
	}
}

class Fila {
	private Jogo[] fila;
	private int frente;
	private int tras;
	private int tamanho;
	
	public Fila(int tamanho) {
		
		fila = new Jogo[tamanho];
		frente = 0;
		tras = 0;
		this.tamanho = tamanho;
	}
	
	public boolean filaVazia() {
	
		boolean resp;
		
		if (frente == tras)
			resp = true;
		else
			resp = false;
		
		return resp;
	}
	
	public boolean filaCheia() {
	
		boolean resp;
		
		if (((tras + 1) % tamanho) == (frente % tamanho))
			resp = true;
		else
			resp = false;
		
		return resp;
	}
	
	public void enfileirar(Jogo novo) throws Exception{
		
		int posicao;
		
		if (! filaCheia()) {
			posicao = tras % tamanho;
			fila[posicao] = novo;
			tras++;
		} else
			throw new Exception("Não foi possível enfileirar o novo elemento: a fila está cheia!");
	}
	
	public Jogo desenfileirar() throws Exception{
		
		Jogo desenfileirado;
		int posicao;
		
		if (! filaVazia()) {
			posicao = frente % tamanho;
			desenfileirado = fila[posicao];
			frente++;
			return desenfileirado;
		} else
			throw new Exception("Não foi possível desenfileirar nenhum elemento: a fila está vazia!");
	}
	
	public void mostrar() throws Exception{
		
		int posicao;
		if (! filaVazia()) {
			System.out.println("Conteúdo da fila:");
			for (int i = frente; i < tras; i++) {
				posicao = i % tamanho;
				System.out.print("Posição: " + posicao + ": ");
				fila[posicao].imprimir();
			}
		} else
			throw new Exception ("Não foi possível mostrar o conteúdo da fila: a fila está vazia!");
	}
}

class ArquivoTextoLeitura {

	private BufferedReader entrada;
	
	ArquivoTextoLeitura(String nomeArquivo) {	
		
		try {
			entrada = new BufferedReader(new FileReader(nomeArquivo));
		}
		catch (FileNotFoundException excecao) {
			System.out.println("Arquivo nao encontrado");
		}
	}
	
	public void fecharArquivo() {
		
		try {
			entrada.close();
		}
		catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo de leitura: " + excecao);	
		}
	}
	
	@SuppressWarnings("finally")
	public String ler() {
		
		String textoEntrada = null;
		
		try {
			textoEntrada = entrada.readLine();
		}
		catch (EOFException excecao) { //Excecao de final de arquivo.
			textoEntrada = null;
		}
		catch (IOException excecao) {
			System.out.println("Erro de leitura: " + excecao);
			textoEntrada = null;
		}
		finally {
			return textoEntrada;
		}
	}
}

class Jogo {
	private int dia;
	private int mes;
	private int ano;
	private String etapa;
	private String selecao1;
	private String selecao2;
	private int placarSelecao1;
	private int placarSelecao2;
	private String local;
	
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
	
	public Jogo(String linhaDado) {
		String[] dadosArquivo = linhaDado.split("#");
		
		int ano = Integer.parseInt(dadosArquivo[0]);
		String etapa = dadosArquivo[1];
		int dia = Integer.parseInt(dadosArquivo[2]);
		int mes = Integer.parseInt(dadosArquivo[3]);
		String selecao1 = dadosArquivo[4];
		int placarSelecao1 = Integer.parseInt(dadosArquivo[5]);
		int placarSelecao2 = Integer.parseInt(dadosArquivo[6]);
		String selecao2 = dadosArquivo[7];
		String local = dadosArquivo[8];
		
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
	
	public static String[] ler() {
		// Lendo a entrada padrao
		int quantidadeDePesquisa = MyIO.readInt();
		String[] dadosPesquisa = new String[quantidadeDePesquisa];
		String linhaPesquisa;
		
		int j = 0;
		while(j < quantidadeDePesquisa) {
			linhaPesquisa = MyIO.readLine();
			dadosPesquisa[j] = linhaPesquisa;

			j++;
		}
		
		return dadosPesquisa;
	}
	
	public static Jogo[] lerArquivo() {
		String arquivo = "tmp/partidas.txt";
		ArquivoTextoLeitura contarLinha = new ArquivoTextoLeitura(arquivo);
		ArquivoTextoLeitura arquivoEntrada = new ArquivoTextoLeitura(arquivo);
		
		int quantidadeLinha = 0;
		
		String linhaContar = contarLinha.ler();
		while(linhaContar != null) {
			quantidadeLinha++;
			linhaContar = contarLinha.ler();
		}
		
		contarLinha.fecharArquivo();
		
		// Preenchendo um vetor de objetos com os dados do arquivo
		Jogo[] vetorPartida = new Jogo[quantidadeLinha];
		
		int i = 0;
		String linhaDado = arquivoEntrada.ler();
		while(linhaDado != null) {
			vetorPartida[i] = new Jogo(linhaDado);
			linhaDado = arquivoEntrada.ler();
			i++;
		}
		
		arquivoEntrada.fecharArquivo();
		
		return vetorPartida;
	}
	
	public static Jogo[] fazerPesquisa(String[] vetorPesquisa, Jogo[] vetorPartida) {
		int i = 0;
		//int j = 0;
		String[] dadosPesquisa;
		Jogo[] vetorResultado = new Jogo[vetorPesquisa.length];
		int quantidadeDePesquisa = vetorPesquisa.length;
		
		while(i < quantidadeDePesquisa) {
			dadosPesquisa = vetorPesquisa[i].split("[;/]+");
			
			int dia = Integer.parseInt(dadosPesquisa[0]);
			int mes = Integer.parseInt(dadosPesquisa[1]);
			int ano = Integer.parseInt(dadosPesquisa[2]);
			String selecao1 = dadosPesquisa[3];
			
			for(int indice = 0; indice < vetorPartida.length; indice++) {
				if(dia == vetorPartida[indice].getDia() && mes == vetorPartida[indice].getMes()
						&& ano == vetorPartida[indice].getAno() && selecao1.equals(vetorPartida[indice].getSelecao1())) {
					vetorResultado[i] = vetorPartida[indice];
					break;
				}
			}
			i++;
		}
		
		return vetorResultado;
	}
	
	public void imprimir() {
		System.out.println("[COPA "+ getAno() +"] [" + getEtapa() + "] "
				+ "[" + getDia() + "/" + getMes() + "] [" + getSelecao1() + " (" + getPlacarSelecao1() + ") "
				+ "x" + " (" + getPlacarSelecao2() + ") " + getSelecao2() + "] [" + getLocal() + "]");
	}
}
