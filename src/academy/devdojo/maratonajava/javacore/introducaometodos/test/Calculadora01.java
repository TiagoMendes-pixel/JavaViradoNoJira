package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class Calculadora01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Fim do método soma de dois números");
        System.out.println("\n---------------------------------------------");
        calculadora.SubtraiDoisNumeros();
        System.out.println("Fim do método subtrai dois números");
        System.out.println("\n---------------------------------------------");



    }
}
