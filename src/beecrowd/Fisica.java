package beecrowd;

import java.util.Scanner;

public class Fisica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int deslocamento = 0;

        while(input.hasNext()) {
            int v = input.nextInt();
            int t = input.nextInt();
             deslocamento = v * (t * 2);
            System.out.println(deslocamento);
        }
      input.close();

    }
}
