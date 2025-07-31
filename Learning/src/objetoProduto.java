public class objetoProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Iphone 14 Pro Max");
        produto1.setPreco(3999.90);
        produto1.setQuantidadeEstoque(10);
        produto1.exibirDetalhes();
        produto1.vender(10);
        produto1.exibirDetalhes();
        produto1.repor(1);
        produto1.exibirDetalhes();
    }
}
