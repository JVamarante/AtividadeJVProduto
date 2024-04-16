class Empresa {
    public static void main(String[] args) {
        Produto livro = new Livro("Java for Dummies", 50.0);
        Produto eletronico = new Eletronico("Smartphone", 1000.0);
        Produto roupa = new Roupa("Camiseta", 30.0);

        imprimirDetalhes(livro);
        imprimirDetalhes(eletronico);
        imprimirDetalhes(roupa);
    }

    public static void imprimirDetalhes(Produto produto) {
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço Original: R$" + produto.getPreco());

        // Verifica se o produto implementa a interface Desconto
        if (produto instanceof Desconto) {
            Desconto produtoComDesconto = (Desconto) produto;
            double precoComDesconto = produtoComDesconto.aplicarDesconto();
            System.out.println("Preço com Desconto: R$" + precoComDesconto);
        } else {
            System.out.println("Este produto não possui desconto.");
        }

        System.out.println();
    }
}