package academy.devdojo.maratonajava.javacore.Hherenca.Dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização");
    }
    {
        System.out.println("Dentro do bloco de inicialização 2");
    }
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
