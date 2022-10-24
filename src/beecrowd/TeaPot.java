package beecrowd;

import java.util.Scanner;

public class TeaPot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insira o tipo do chá");
        int t = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int contador = 0;
            if(t == a){
                contador = contador + 1;
            }
            if (t == b){
                contador = contador + 1;
            }
            if (t == c){
            contador = contador + 1;
            }
            if (t == d){
            contador = contador + 1;
            }
            if (t == e){
            contador = contador + 1;
            }

        System.out.println(contador);
    }
}
