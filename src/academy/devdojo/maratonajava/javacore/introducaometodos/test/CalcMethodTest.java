package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.CalcMethod;

public class CalcMethodTest {
    public static void main(String[] args) {
        CalcMethod calculadora = new CalcMethod();

        calculadora.multiplicaDoisNumeros(10, 15);
        System.out.println("Fim do método de multiplicação");

        System.out.println("--------------------------------");

        calculadora.somaDoisNumeros(15, 5, 8);
        System.out.println("Fim do método de soma");

    }

}

