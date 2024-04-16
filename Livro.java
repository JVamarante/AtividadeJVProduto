class Livro extends Produto implements Desconto {
    public Livro(String nome, double preco) {
        super(nome, preco, TipoProduto.LIVRARIA);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }

    @Override
    public double aplicarDesconto() {
        return calcularPrecoFinal();
    }
}