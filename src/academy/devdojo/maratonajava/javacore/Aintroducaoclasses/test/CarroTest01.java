package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();



        carro01.nome = "Fusca";
        carro01.modelo = "hatch";
        carro01.ano = 1989;

        carro02.nome = "Chevet";
        carro02.modelo = "hatch";
        carro02.ano = 2000;

        carro02 = carro01;


        System.out.println(carro01.nome + carro01.modelo + carro01.ano);
        System.out.println("------------------------------------------------");
        System.out.println("\n" +carro02.nome + carro02.modelo + carro02.ano);
    }
}
