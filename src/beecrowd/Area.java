package beecrowd;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.next());
        double b = Double.parseDouble(input.next());
        double c = Double.parseDouble(input.next());

        //starting the calculation
        double rectangledTriangle = (a*c)/2;

        System.out.println(String.format("TRIANGULO: %.3f ", rectangledTriangle));
    }
}
