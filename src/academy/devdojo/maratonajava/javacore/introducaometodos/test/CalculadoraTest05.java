package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int[] numeros02 = {1,2,3};
        calculadora.somaArray(numeros);

        System.out.println("Fim do método");

        calculadora.somaArgsVar(2, 8, numeros02);
    }

}
