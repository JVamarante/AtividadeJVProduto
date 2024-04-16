class Eletronico extends Produto implements Desconto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double aplicarDesconto() {
        return preco * 0.95;
    }
}