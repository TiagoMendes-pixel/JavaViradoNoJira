package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 5);
        double result02 = calculadora.divideDoisNumeros02(15, 3);

       // System.out.println("Result é " + result);
       // System.out.println("Result é " + result02);
        calculadora.imprimiDoisNumeros(86, 0);

    }
}
