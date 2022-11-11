package firstSteps;

import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int quantityDogFood = Integer.parseInt(scanner.nextLine());
        int quantityCatFood = Integer.parseInt(scanner.nextLine());

        double pricePerOnePackageDogFood = 2.50;
        double pricePerOnePackageCatFood = 4.00;

        double neededMoney = (quantityDogFood * pricePerOnePackageDogFood) + (quantityCatFood * pricePerOnePackageCatFood);

        System.out.printf("%.1f lv.", neededMoney);

    }
}
