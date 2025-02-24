package academy.devdojo.maratonajava.javacore.Hherenca.Dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
