package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Oliveiras");
        endereco.setCep("111111111");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Tiago Mendes Carvalho");
        pessoa.setCpf("361674478-45");
        pessoa.setEndereco(endereco);

        pessoa.imprime();


        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thais Lara Carvalho");
        funcionario.setCpf("555555544411");
        funcionario.setEndereco(endereco);
        funcionario.setSalario("R$5000,00");
        System.out.println("---------------------");
        funcionario.imprime();



    }
}
