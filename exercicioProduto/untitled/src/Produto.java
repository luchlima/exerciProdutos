public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String dataValidade;

    public Produto(String nome, double preco, int quantidade, String dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " (Preco: " + preco + ")" + "(Quantidade: " + quantidade + ")" + "(Data de Validade: " + dataValidade + ")";
    }

}
