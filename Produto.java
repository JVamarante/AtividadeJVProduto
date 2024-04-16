abstract class Produto {
    protected String nome;
    protected double preco;
    protected TipoProduto tipo;

    public Produto(String nome, double preco, TipoProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public abstract double calcularPrecoFinal();

    @Override
    public String toString() {
        return "Nome do Produto: " + nome + "\n" +
                "Preço Original: R$" + preco + "\n" +
                "Tipo: " + tipo + "\n";
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}