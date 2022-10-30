import java.io.*;

public class Aplicacao {

    public static void main(String[] args) {
        MyIO.setCharset("UTF-8");
        String arquivo = "tmp/partidas.txt";

        Jogo j1 = new Jogo();
        Jogo[] vetorPartida = j1.lerArquivo(arquivo);
        String[] vetorPesquisa = j1.ler();
        Jogo[] vetorDeJogos = new Jogo[vetorPesquisa.length];

        int i = 0;
        for(String dado : vetorPesquisa) {
            vetorDeJogos[i] = j1.fazerPesquisa(dado, vetorPartida);
            i++;
        }

        j1.bubblesort(vetorDeJogos, vetorDeJogos.length);

        for(Jogo jogo : vetorDeJogos) {
            jogo.imprimir();
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

    // Para instanciarmos esta classe com esse construtor, e necessario fazer split antes da instancia
    public Jogo(int dia, int mes, int ano, String etapa, String selecao1, String selecao2, int placarSelecao1, int placarSelecao2, String local) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
        this.setEtapa(etapa);
        this.setSelecao1(selecao1);
        this.setSelecao2(selecao2);
        this.setPlacarSelecao1(placarSelecao1);
        this.setPlacarSelecao2(placarSelecao2);
        this.setLocal(local);
    }

    // Para instanciarmos esta classe com este construtor, apenas passe a linha da entrada padrao
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
        this.setAno(ano);
        this.setEtapa(etapa);
        this.setSelecao1(selecao1);
        this.setSelecao2(selecao2);
        this.setPlacarSelecao1(placarSelecao1);
        this.setPlacarSelecao2(placarSelecao2);
        this.setLocal(local);
    }

    // esse construtor foi implementado somente para conseguirmos usar esta classe na classe Aplicacao
    public Jogo() {}

    // Getters e setters
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

    public void bubblesort(Jogo[] vetor, int n) {
        for (int i = (n - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                Jogo jogoAtual = vetor[j];
                Jogo proximoJogo = vetor[j+1];
                Jogo temp;

                boolean primeiroPlacar = jogoAtual.getPlacarSelecao1() ==  jogoAtual.getPlacarSelecao2();
                boolean segundoPlacar = proximoJogo.getPlacarSelecao1() == proximoJogo.getPlacarSelecao2();
                boolean atributo_dia = (jogoAtual.getDia() < proximoJogo.getDia());
                boolean atributo_mes = (jogoAtual.getMes() < proximoJogo.getMes());
                boolean atributo_ano = (jogoAtual.getAno() < proximoJogo.getAno());
                int atributo_selecao = (jogoAtual.getSelecao1().compareTo(proximoJogo.getSelecao1()));
                boolean ordenando_selecao = atributo_selecao == 0;

                if (!(primeiroPlacar && segundoPlacar)) {
                    if(atributo_dia) {
                        temp = vetor[j];
                        vetor[j] = vetor[j+1];
                        vetor[j+1] = temp;
                    }
                }

                if(primeiroPlacar || segundoPlacar) {
                    if(atributo_mes && atributo_ano && ordenando_selecao) {
                        temp = vetor[j];
                        vetor[j] = vetor[j+1];
                        vetor[j+1] = temp;
                    }
                }
            }
        }
    }
    // Le a entrada padrao da aplicacao
    public String[] ler() {

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

    // Le dos dados de um arquivo a partir de um caminho especifico
    public Jogo[] lerArquivo(String arquivo) {
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

    // Faz a pesquisa com base em dois parametros, a linha da pesquisa em um vetor de partidas
    public Jogo fazerPesquisa(String pesquisa, Jogo[] vetorPartida) {
        String[] dadosPesquisa;

        while(true) {
            dadosPesquisa = pesquisa.split("[;/]+");
            int dia = Integer.parseInt(dadosPesquisa[0]);
            int mes = Integer.parseInt(dadosPesquisa[1]);
            int ano = Integer.parseInt(dadosPesquisa[2]);
            String selecao1 = dadosPesquisa[3];

            for (Jogo jogo : vetorPartida) {
                if (dia == jogo.getDia() && mes == jogo.getMes()
                        && ano == jogo.getAno() && selecao1.equals(jogo.getSelecao1())) {
                    return jogo;
                }
            }
        }
    }

    // Imprime o valor dos atributos de determinada partida
    public void imprimir() {
        System.out.println("[COPA "+ getAno() +"] [" + getEtapa() + "] "
                + "[" + getDia() + "/" + getMes() + "] [" + getSelecao1() + " (" + getPlacarSelecao1() + ") "
                + "x" + " (" + getPlacarSelecao2() + ") " + getSelecao2() + "] [" + getLocal() + "]");
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