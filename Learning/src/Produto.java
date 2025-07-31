public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
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
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void exibirDetalhes(){
        System.out.println("Nome: "+getNome()+", Preco: "+getPreco()+", Quantidade em Estoque: "+getQuantidadeEstoque());
    }
    public void vender(int qtd){
        if (qtd <= 0) {
            System.out.println("A quantidade a ser vendida deve ser positiva.");
        } else if (this.quantidadeEstoque >= qtd) { 
            this.quantidadeEstoque -= qtd; 
            System.out.println(qtd + " unidades de " + this.nome + " vendidas. Novo estoque: " + this.quantidadeEstoque);
        } else {
            System.out.println("Estoque insuficiente! Tentando vender " + qtd + " mas há apenas " + this.quantidadeEstoque + " em estoque.");
        }
    }
    public void repor(int qtd){
        this.quantidadeEstoque = this.quantidadeEstoque + qtd;
        System.out.println("Foi reposto: "+qtd+" unidades e ficou no total: "+this.quantidadeEstoque);
    }
}
