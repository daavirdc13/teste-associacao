package academy.devdojo.maratonajava.javacore.Hherenca.Test;

import academy.devdojo.maratonajava.javacore.Hherenca.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das flores");
        endereco.setCep("08240-170");

        Pessoa pessoa = new Pessoa("Oda");
        pessoa.setCpf("2402665454");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("---------------");


        Funcionario funcionario = new Funcionario("Jira");
        funcionario.setCpf("24026987");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2.500);

        funcionario.imprime();

    }
}
