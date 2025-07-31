public class Pessoa {
    private String nome;
    private int idade;
    private String dataNascimento;

    public void apresentar(){
        System.out.println("Ola, meu nome e "+getNome()+". Tenho "+getIdade()+" anos e nasci em "+getDataNascimento());
    }
    public void aniversario(){
        this.idade++;
        System.out.println("Parabens! Voce fez aniversario hoje e esta completando "+ this.idade + " anos!");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
