// Hash map que usa o método de RESTO DE DIVISÃO para hashing.
public class HashMapDIV {
    public static class Node {
        Registro dado;
        Node proximo;

        public Node() {}

        public Registro getDado() {
            return dado;
        }

        public void setDado(Registro dado) {
            this.dado = dado;
        }

        public Node getProximo() {
            return proximo;
        }

        public void setProximo(Node proximo) {
            this.proximo = proximo;
        }
    }

    private Node[] tabela;
    private int tamanho;
    private int colisoes;
    private int comparacoesBusca;

    public HashMapDIV(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new Node[tamanho];
        this.colisoes = 0;
    }

    // Função hash usando o método de resto da divisão
    private int hash(String codigo) {
        long k = Long.parseLong(codigo);
        return (int)(k % tamanho);
    }

    public void inserir(String codigo) {
        Registro registro = new Registro(codigo);
        int indice = hash(codigo);
        if (tabela[indice] != null) colisoes++;

        Node novo = new Node();
        novo.dado = registro;
        novo.proximo = tabela[indice];
        tabela[indice] = novo;
    }

    public boolean buscar(String codigo) {
        comparacoesBusca = 0;
        int indice = hash(codigo);
        Node atual = tabela[indice];
        while (atual != null) {
            comparacoesBusca++;
            if (atual.dado.getCodigo().equals(codigo)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public int getColisoes() {
        return colisoes;
    }

    public int getComparacoesBusca() {
        return comparacoesBusca;
    }

    public void setComparacoesBusca(int comparacoesBusca) {
        this.comparacoesBusca = comparacoesBusca;
    }
}
