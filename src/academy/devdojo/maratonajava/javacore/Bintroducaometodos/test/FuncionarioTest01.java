package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.nome = "Davi";
        funcionario01.idade = 21;
        funcionario01.salario = 2800;

        funcionario02.nome = "Tiphany";
        funcionario02.idade = 19;
        funcionario02.salario = 1500;

        funcionario03.nome = "Astolfo";
        funcionario03.idade = 34;
        funcionario03.salario = 4200;

        funcionario01.imprimeDados();
        System.out.println("############################");
        funcionario02.imprimeDados();
        System.out.println("############################");
        funcionario03.imprimeDados();
        System.out.println("############################");

        double res = (funcionario01.salario + funcionario02.salario + funcionario03.salario) / 3;

        System.out.println("A média salarial dos funcionários é de "+String.format("%.2f", res));

    }
}
