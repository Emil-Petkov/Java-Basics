package firstSteps;

import java.util.Scanner;

public class depositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());


        double accruedInterest = deposit * interest / 100;
        double interestPerMonth = accruedInterest / 12;

        double total = deposit + months * interestPerMonth;

        System.out.println(total);

    }
}
