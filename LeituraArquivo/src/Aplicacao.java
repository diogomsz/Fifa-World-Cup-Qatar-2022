
public class Aplicacao {

	public static void main(String[] args) {
		String nomeArquivo;
		String texto;
		ArquivoTextoEscrita arquivoEscrita;
	
		System.out.println("Informe o nome do arquivo onde os dados serão gravados: ");
		nomeArquivo = MyIO.readLine();
		
		arquivoEscrita = new ArquivoTextoEscrita(nomeArquivo);
		
		System.out.println("Digite o texto que será armazenado o arquivo: ");
		texto = MyIO.readLine();
		
		arquivoEscrita.escrever(texto);
		arquivoEscrita.fecharArquivo();
	}
}
