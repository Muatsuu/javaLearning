public class ObjetoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Enzo");
        pessoa.setIdade(25);
        pessoa.setDataNascimento("24/04/2000");
        pessoa.apresentar();
        pessoa.aniversario();
    }
}
