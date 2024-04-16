class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco, TipoProduto.VESTUARIO);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco;
    }
}
