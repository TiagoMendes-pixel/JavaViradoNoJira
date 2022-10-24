package beecrowd;

import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double fixedSalary = Double.parseDouble(input.nextLine());
        double sales = Double.parseDouble(input.nextLine());

        sales = (sales * 0.15) + fixedSalary;

        System.out.println(String.format("TOTAL = R$ %.2f", sales));
    }


}
