public class Aplicacao {
	public static void main(String[] args) {
		// Escrita de dados em um arquivo
		String nomeArquivo;
		String texto;
		ArquivoTextoEscrita arquivoEscrita;
		ArquivoTextoLeitura arquivoEntrada;
	
		System.out.println("Informe o nome do arquivo onde os dados serão gravados: ");
		nomeArquivo = MyIO.readLine();
		
		arquivoEscrita = new ArquivoTextoEscrita(nomeArquivo);
		
		System.out.println("Digite o texto que será armazenado o arquivo: ");
		texto = MyIO.readLine();
		
		while(!texto.equals("FIM")) {
			arquivoEscrita.escrever(texto);
			texto = MyIO.readLine();
		}
		
		arquivoEscrita.fecharArquivo();
		
		// Leitura de dados de um arquivo
		arquivoEntrada = new ArquivoTextoLeitura(nomeArquivo);
		
		texto = arquivoEntrada.ler();
		
		while(texto != null) {
			System.out.println(texto);
			texto = arquivoEntrada.ler();
		}
	}
}
