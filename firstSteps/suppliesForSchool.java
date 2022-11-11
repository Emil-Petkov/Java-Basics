package firstSteps;

import java.util.Scanner;

public class suppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfPacksOfPens = Integer.parseInt(scanner.nextLine());
        int numberOfPacksOfMarkers = Integer.parseInt(scanner.nextLine());
        int litersOfChalkboardCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());


        double packagePen = 5.80;
        double packageMarker = 7.20;
        double preparationPerLiter = 1.20;

        double neededMoneyBeforeDiscount = (numberOfPacksOfPens * packagePen) +
                (numberOfPacksOfMarkers * packageMarker) + (litersOfChalkboardCleaner * preparationPerLiter);

        double calculateDiscount = (neededMoneyBeforeDiscount * discount) / 100;

        double total = neededMoneyBeforeDiscount - calculateDiscount;

        System.out.println(total);

    }
}
