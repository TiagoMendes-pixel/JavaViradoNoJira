package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Calculadora {
    //criando os métodos

    public void somaDoisNumeros(){
        System.out.println(10 + 12);
    }

    public void SubtraiDoisNumeros(){
        System.out.println(20-15);
    }

    public void MultiplicaDoisNumeros(int n1, int n2){
        System.out.println(n1 * n2);

    }

    public double divideDoisNumeros(int n1, int n2){
        if(n2 == 0){
            return 0;
        }
        return n1/n2;
    }

    public double divideDoisNumeros02(int n1, int n2){
        if(n2 != 0){
            return n1/n2;
        }else {
            return 0;
        }
    }

    public void imprimiDoisNumeros(double n1, double n2){
        if(n2 == 0){
            System.out.println("Não existe divisão por zero");
            //return fucionando com um break;
            return;
        }
        System.out.println(n1/n2);
    }

    public void alteraDoisNumeros(int num1,  int num2){
        num1 = 56;
        num2 = 88;

        System.out.println(num1 + " " + " " +  num2);
    }

    public void somaArray(int[] numeros){

        int soma = 0;
        for (int num: numeros) {

            soma += num;
        }
        System.out.println(soma);

    }

    public void somaArgsVar(int valor, int valor02, int... numeros01){
        int somavalor = valor + valor02;
        int soma = 0;
        for (int num02: numeros01) {

            soma += num02;
        }
        System.out.println(somavalor + " "+ " "  + soma);


    }

}
