class Empresa {
    public static void main(String[] args) {
        Produto livro = new Livro("Livro de Java", 50.0);
        Produto eletronico = new Eletronico("Smartphone", 1000.0);
        Produto roupa = new Roupa("Camiseta", 30.0);

        System.out.println(livro);
        System.out.println("Preço com Desconto: R$" + ((Desconto) livro).aplicarDesconto() + "\n");

        System.out.println(eletronico);
        System.out.println("Preço com Desconto: R$" + ((Desconto) eletronico).aplicarDesconto() + "\n");

        System.out.println(roupa);
    }
}