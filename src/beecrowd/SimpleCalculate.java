package beecrowd;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int code = input.nextInt();
        int units = input.nextInt();
        double price = Double.parseDouble(input.next());
        int code2 = input.nextInt();
        int units2 = input.nextInt();
        double price2 = Double.parseDouble(input.next());

        double valorTot = (price * units) + (price2 * units2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorTot));


    }
}
