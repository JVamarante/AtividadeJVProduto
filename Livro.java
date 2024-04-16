class Livro extends Produto implements Desconto {
    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double aplicarDesconto() {
        return preco * 0.9;
    }
}