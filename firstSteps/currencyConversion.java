package firstSteps;

import java.util.Scanner;

public class currencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bgn = 1.79549;

        double usd = Double.parseDouble(scanner.nextLine());
        double convert = usd * bgn;

        System.out.println(convert);
    }
}
