import java.io.*;

public class Aplicacao {

    public static void main(String[] args) throws Exception {
        MyIO.setCharset("UTF-8");
        String arquivo = "/tmp/partidas.txt";

        Jogo j1 = new Jogo();
        Jogo[] vetorPartida = j1.lerArquivo(arquivo);
        String[] vetorPesquisa = j1.ler();

        ListaLinear listaLinear = new ListaLinear(vetorPesquisa.length);

        int i = 0;
        for(String dado : vetorPesquisa) {
            Jogo resultadoPesquisa = j1.fazerPesquisa(dado, vetorPartida);
            listaLinear.inserir(resultadoPesquisa, i);
            i++;
        }

        // Lendo a segunda parte da entrada padrao
        int quantidadeDeJogos = MyIO.readInt();

        int j = 0;
        while(j < quantidadeDeJogos) {
            String linha = MyIO.readLine();

            if(linha.equals("RF")) {

            }

            System.out.println(linha);

            j++;
        }

        listaLinear.imprimir();
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

    //  Cria uma copia de uma instancia da classe jogo
    /*
    public Jogo cloneJogo() {
        int dia = this.dia;
        int mes = this.mes;
        int ano = this.ano;
        String etapa = this.etapa;
        String selecao1 = this.selecao1;
        String selecao2 = this.selecao2;
        int placarSelecao1 = this.placarSelecao1;
        int placarSelecao2 = this.placarSelecao2;
        String local = this.local;

        return new Jogo(dia, mes, ano, etapa, selecao1, selecao2, placarSelecao1, placarSelecao2, local);
    }
*/
    // Le a entrada padrao da aplicacao
    public String[] ler() {

        // Lendo a entrada padrao
        int quantidadeDePesquisa = 0;
        String[] dadosPesquisa = new String[quantidadeDePesquisa];
        String linhaPesquisa;

        linhaPesquisa = MyIO.readLine();
        int j = 0;

        while(!linhaPesquisa.equals("FIM")) {

            String[] novoVetor = new String[dadosPesquisa.length + 1];

            for(int i = 0; i < dadosPesquisa.length; i++) {
                novoVetor[i] = dadosPesquisa[i];
            }

            dadosPesquisa = novoVetor;


            dadosPesquisa[j] = linhaPesquisa;
            linhaPesquisa = MyIO.readLine();

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

class ListaLinear {

    private Jogo lista[];
    private int primeiro;
    private int ultimo;
    private int tamanho;

    public ListaLinear(int M) {

        lista = new Jogo[M];
        tamanho = 0;
        primeiro = 0;
        ultimo = 0;
    }

    public boolean listaVazia() {

        boolean resp;

        if (primeiro == ultimo)
            resp = true;
        else
            resp = false;

        return resp;
    }

    public boolean listaCheia() {

        boolean resp;

        if (ultimo == lista.length)
            // if (tamanho == lista.length)
            resp = true;
        else
            resp = false;

        return resp;
    }

    public void inserir(Jogo novo, int posicao) throws Exception {

        if (! listaCheia()) {
            if ((posicao >= 0) && (posicao <= tamanho)) {
                for (int i = ultimo; i > posicao; i--)
                    lista[i] = lista[i-1];

                lista[posicao] = novo;

                ultimo++;
                tamanho++;
            } else
                throw new Exception("Não foi possível inserir o item na lista: posição informada é inválida!");
        } else
            throw new Exception("Não foi possível inserir o item na lista: a lista está cheia!");
    }

    public Jogo remover(int posicao) throws Exception {

        Jogo removido;

        if (! listaVazia()) {
            if ((posicao >= 0) && (posicao < tamanho)) {

                removido = lista[posicao];
                tamanho--;

                for (int i = posicao; i < tamanho; i++) {
                    lista[i] = lista[i+1];
                }

                ultimo--;

                return removido;
            } else
                throw new Exception("Não foi possível remover o item da lista: posição informada é inválida!");
        } else
            throw new Exception("Não foi possível remover o item da lista: a lista está vazia!");
    }

    public void imprimir() throws Exception {

        if (! listaVazia()) {

            for (int i = primeiro; i < ultimo; i++) {
                System.out.print("Posição: " + i + ": ");
                lista[i].imprimir();
            }
        } else
            throw new Exception("Não foi possível imprimir o conteúdo da lista: a lista está vazia!");
    }
}

class ListaEncadeada {

    private Celula primeiro;
    private Celula ultimo;
    private int tamanho;

    public ListaEncadeada() {

        Celula sentinela = new Celula();

        primeiro = sentinela;
        ultimo = sentinela;
        tamanho = 0;
    }

    public boolean listaVazia() {

        boolean resp;

        if (primeiro == ultimo)
            resp = true;
        else
            resp = false;

        return resp;
    }

    public void inserir(Jogo novo, int posicao) throws Exception {

        Celula anterior, novaCelula, proximaCelula;

        if ((posicao >= 0) && (posicao <= tamanho)) {
            anterior = primeiro;
            for (int i = 0; i < posicao; i++)
                anterior = anterior.getProximo();

            novaCelula = new Celula(novo);

            proximaCelula = anterior.getProximo();

            anterior.setProximo(novaCelula);
            novaCelula.setProximo(proximaCelula);

            if (posicao == tamanho)  // a inserção ocorreu na última posição da lista
                ultimo = novaCelula;

            tamanho++;

        } else
            throw new Exception("Não foi possível inserir o item na lista: a posição informada é inválida!");
    }

    public Jogo remover(int posicao) throws Exception {

        Celula anterior, celulaRemovida, proximaCelula;

        if (! listaVazia()) {
            if ((posicao >= 0) && (posicao < tamanho)) {
                anterior = primeiro;
                for (int i = 0; i < posicao; i++)
                    anterior = anterior.getProximo();

                celulaRemovida = anterior.getProximo();

                proximaCelula = celulaRemovida.getProximo();

                anterior.setProximo(proximaCelula);
                celulaRemovida.setProximo(null);

                if (celulaRemovida == ultimo)
                    ultimo = anterior;

                tamanho--;

                return (celulaRemovida.getItem());
            } else
                throw new Exception("Não foi possível remover o item da lista: a posição informada é inválida!");
        } else
            throw new Exception("Não foi possível remover o item da lista: a lista está vazia!");
    }

    public void imprimir() throws Exception {

        Celula aux;

        if (! listaVazia()) {
            System.out.println("Conteúdo da lista:");

            aux = primeiro.getProximo();
            while (aux != null) {
                aux.getItem().imprimir();
                aux = aux.getProximo();
            }
        } else
            throw new Exception("Não foi possível imprimir o conteúdo da lista: a lista está vazia!");
    }
}

class ListaDuplamenteEncadeada {

    private Celula primeiro;
    private Celula ultimo;
    private int tamanho;

    public ListaDuplamenteEncadeada() {

        Celula sentinela;

        sentinela = new Celula();

        primeiro = sentinela;
        ultimo = sentinela;

        tamanho = 0;
    }

    public boolean listaVazia() {

        boolean resp;

        if (primeiro == ultimo)
            resp = true;
        else
            resp = false;

        return resp;
    }

    public void inserirFinal(Jogo novo) {

        Celula novaCelula;

        novaCelula = new Celula(novo);

        ultimo.setProximo(novaCelula);
        novaCelula.setAnterior(ultimo);

        ultimo = novaCelula;

        tamanho++;

    }

    public Jogo removerFinal() throws Exception {

        Celula removida, penultima;

        if (! listaVazia()) {

            removida = ultimo;

            penultima = ultimo.getAnterior();
            penultima.setProximo(null);
            removida.setAnterior(null);

            ultimo = penultima;

            tamanho--;

            return (removida.getItem());
        } else
            throw new Exception("Não foi possível remover o último item da lista: a lista está vazia!");
    }

    public void imprimir() throws Exception {

        Celula aux;

        if (! listaVazia()) {
            System.out.println("Conteúdo da lista:");
            aux = primeiro.getProximo();
            while (aux != null) {
                aux.getItem().imprimir();
                aux = aux.getProximo();
            }
        } else
            throw new Exception("Não foi possível imprimir o conteúdo da lista: a lista está vazia!");
    }
}

class FilaVetor {
    private Jogo[] fila;
    private int frente;
    private int tras;
    private int tamanho;

    public FilaVetor(int tamanho) {

        fila = new Jogo[tamanho];
        frente = 0;
        tras = 0;
        this.tamanho = tamanho;
    }

    public boolean filaVazia() {

        boolean resp;

        if (frente == tras) {
            resp = true;
        }
        else {
            resp = false;
        }

        return resp;
    }

    public boolean filaCheia() {

        boolean resp;

        if (((tras + 1) % tamanho) == (frente % tamanho)) {
            resp = true;
        }
        else {
            resp = false;
        }

        return resp;
    }

    public void enfileirar(Jogo novo) throws Exception {

        int posicao;

        if(! filaCheia()) {
            posicao = tras % tamanho;
            fila[posicao] = novo;
            tras++;
        } else {
            throw new Exception("Não foi possível enfileirar, a fila está cheia!");
        }
    }

    public Jogo desenfileirar() throws Exception {

        Jogo desenfileirado;
        int posicao;

        if (! filaVazia()) {
            posicao = frente % tamanho;
            desenfileirado = fila[posicao];
            frente++;
            return desenfileirado;
        } else {
            throw new Exception("Não foi possível desenfileirar, a fila está vazia!");
        }
    }

    public void mostrar(){

        int posicao;
        int index = 0;
        if (! filaVazia()) {
            for (int i = frente; i < tras; i++) {
                posicao = i % tamanho;
                System.out.print("[" + index + "]");
                fila[posicao].imprimir();
                index++;
            }
        }
    }

    public double obterMediaGols() {
        double qtdeJogos = 0;
        double qtdeGols = 0;
        double mediaTotal;

        int p = 0;

        if(filaVazia()) {
            return 0;
        }

        for(int i = frente; i < tras; i++) {
            p = i % tamanho;
            qtdeGols += fila[p].getPlacarSelecao1() + fila[p].getPlacarSelecao2();
            qtdeJogos++;
        }

        mediaTotal = Math.round(qtdeGols / qtdeJogos);
        return mediaTotal;
    }
}

class PilhaVetor {

    private Jogo pilha[];
    private int topo;

    public PilhaVetor(int tamanho) {
        pilha = new Jogo[tamanho];
        topo = 0;
    }

    public boolean pilhaCheia() {

        boolean resp;

        if (topo == pilha.length)
            resp = true;
        else
            resp = false;

        return resp;
    }

    public boolean pilhaVazia() {

        boolean resp;

        if (topo == 0)
            resp = true;
        else
            resp = false;

        return resp;
    }

    public Jogo desempilhar() throws Exception {

        Jogo desempilhado;

        if (! pilhaVazia()) {
            topo--;
            desempilhado = pilha[topo];
            return desempilhado;
        } else
            throw new Exception("Não foi possível desempilhar: a pilha está vazia!");
    }

    public void empilhar(Jogo novo) throws Exception {

        if (! pilhaCheia()) {
            pilha[topo] = novo;
            topo++;
        } else
            throw new Exception("Não foi possível empilhar: a pilha está cheia!");
    }

    public Jogo consultarTopo() throws Exception {

        if (! pilhaVazia()) {
            return (pilha[topo-1]);
        } else
            throw new Exception("Não foi possível consultar o elemento do topo da pilha: a pilha está vazia!");
    }

    public void mostrar() {
        int index = 0;

        for(int i = 0; i < topo; i++) {
            System.out.print("[" + index + "] ");
            pilha[i].imprimir();
            index++;
        }
    }

}

class Celula {

    private Jogo item;
    private Celula anterior;
    private Celula proximo;

    public Celula(Jogo novo) {

        item = novo;
        anterior = null;
        proximo = null;
    }

    public Celula() {

        item = new Jogo();
        anterior = null;
        proximo = null;
    }

    public Jogo getItem() {
        return item;
    }
    public void setItem(Jogo item) {
        this.item = item;
    }

    public Celula getProximo() {
        return proximo;
    }
    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula getAnterior() {
        return anterior;
    }
    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
}

class FilaDinamica {

	private Celula frente;
	private Celula tras;

	public FilaDinamica() {

		Celula sentinela;

		sentinela = new Celula();
		frente = sentinela;
		tras = sentinela;
	}

	public boolean filaVazia() {

		boolean resp;

		if (frente == tras)
			resp = true;
		else
			resp = false;

		return resp;
	}

	public void enfileirar(Jogo novo) {

		Celula novaCelula;

		novaCelula = new Celula(novo);

		tras.setProximo(novaCelula);
		tras = novaCelula;
		// tras = tras.getProximo();
	}

	public Jogo desenfileirar() throws Exception {

		Celula celulaDesenfileirada;
		Celula proximaCelula;

		if (! filaVazia()) {

			celulaDesenfileirada = frente.getProximo();
			proximaCelula = celulaDesenfileirada.getProximo();
			frente.setProximo(proximaCelula);

			if (celulaDesenfileirada == tras) // se a célula retirada for a última célula da fila
				tras = frente;

			return (celulaDesenfileirada.getItem());
		} else
			throw new Exception("Não foi possível desenfileirar nenhum item: a fila está vazia!");
	}

	public void imprimir() throws Exception {

		Celula aux;

		if (! filaVazia()) {
			System.out.println("Conteúdo da fila:");

			aux = frente.getProximo();

			while (aux != null) {
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} else
			throw new Exception ("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");
	}

	public double obterMediaGols() {
		double qtdeJogos = 0;
		double qtdeGols = 0;
		double mediaTotal;

		Celula cel;

		int p = 0;

		if(!filaVazia()) {
			cel  = frente.getProximo();

			while(cel != null) {
				qtdeGols += cel.getItem().getPlacarSelecao1() + cel.getItem().getPlacarSelecao2();
				qtdeJogos++;
				cel = cel.getProximo();
			}
		} else {
			return 0;
		}

		mediaTotal = Math.round(qtdeGols / qtdeJogos);
		return mediaTotal;
	}
}

class PilhaDinamica {

    private Celula fundo;
    private Celula topo;

    public PilhaDinamica() {

        Celula sentinela;

        sentinela = new Celula();
        fundo = sentinela;
        topo = sentinela;
    }

    public boolean pilhaVazia() {

        boolean resp;

        if (topo == fundo)
            resp = true;
        else
            resp = false;

        return resp;
    }

    public void empilhar(Jogo novo) {

        Celula novaCelula;

        novaCelula = new Celula(novo);
        novaCelula.setProximo(topo);
        topo = novaCelula;
    }

    public Jogo desempilhar() throws Exception {

        Celula desempilhado;

        if (!pilhaVazia()) {
            desempilhado = topo;
            topo = topo.getProximo();
            desempilhado.setProximo(null);
            return (desempilhado.getItem());
        } else {
            throw new Exception("Não foi possível desempilhar: a pilha está vazia!");
        }
    }

    public Jogo consultarTopo() throws Exception {

        if (! pilhaVazia()) {
            return(topo.getItem());
        } else {
            throw new Exception("Não foi possível consultar o topo da pilha: a pilha está vazia!");
        }
    }

    public void mostrar() throws Exception {
        Celula aux;
        Celula[] dados = new Celula[1];
        int index = 0;

        dados[index] = topo;
        index++;

        if (! pilhaVazia()) {

            aux = topo.getProximo();

            while (aux != null) {
                Celula[] novoVetor = new Celula[dados.length + 1];

                for(int i = 0; i < dados.length; i++) {
                    novoVetor[i] = dados[i];
                }

                dados = novoVetor;
                dados[index] = aux;
                index++;

                aux = aux.getProximo();
            }
        } else {
            throw new Exception ("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");
        }

        int tamanho = 0;
        for(int i = dados.length-1; i >= 0; i--) {
            if(dados[i].getItem().getLocal() == null) continue;
            System.out.print("[" + tamanho + "]");
            dados[i].getItem().imprimir();
            tamanho++;
        }

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