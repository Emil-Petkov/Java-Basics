package firstSteps;

import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double areaGreeningInSquareMeter = Double.parseDouble(scanner.nextLine());
        double pricePerSquareMeter = 7.61;
        double neededMoneyAfterDiscount = areaGreeningInSquareMeter * pricePerSquareMeter;

        double discount = neededMoneyAfterDiscount * 0.18;
        double finalPrice = neededMoneyAfterDiscount - discount;

        System.out.printf("The final price is: %.2f lv.\n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
