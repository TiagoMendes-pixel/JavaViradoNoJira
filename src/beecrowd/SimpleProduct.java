package beecrowd;

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int v1 = input.nextInt();
        int v2 = input.nextInt();

        int prod = v1 * v2;

        System.out.println("PROD = " + prod);

    }
}
