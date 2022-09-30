public class TestaLerArquivoPartidas {
	public static void main(String[] args) {
		ArquivoTextoLeitura readFile = new ArquivoTextoLeitura("partidas.txt");
		String texto = readFile.ler();
		int tamanhoVetor = 1;
		
		while(texto != null) {
			tamanhoVetor++;
		}
		
		System.out.println(tamanhoVetor);
	}
}
