class Eletronico extends Produto implements Desconto {
    public Eletronico(String nome, double preco) {
        super(nome, preco, TipoProduto.ELETRONICO);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco;
    }

    @Override
    public double aplicarDesconto() {
        return calcularPrecoFinal();
    }
}