package academy.devdojo.maratonajava.introducao;

public class Aula07Arryas02 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
        int[] numeros3 = new int[]{12, 13, 4};

        for (int numero: numeros2
             ) {
            System.out.println(numero);
        }

        System.out.println("#####################");

        for(int i = 0; i< numeros2.length; i++){
            System.out.print(numeros2[i] + " ");
        }
        System.out.println("\nEstou pegando o jeitão da coisa");
        for(int numero: numeros2){
            System.out.print(numero + " ");
        };
        System.out.println("teste");
        for(int i = 0; i < numeros3.length; i++){
            System.out.println(numeros3[i]);
        }
    }
}
