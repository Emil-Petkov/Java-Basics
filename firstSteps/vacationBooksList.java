package firstSteps;

import java.util.Scanner;

public class vacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int howManyPagesIsTheBook = Integer.parseInt(scanner.nextLine());
        int readPagesPerHour = Integer.parseInt(scanner.nextLine());
        int neededDaysPerReadTheBook = Integer.parseInt(scanner.nextLine());

        int neededHourForAllTheBook = howManyPagesIsTheBook / readPagesPerHour;
        int neededHourReadPerDay = neededHourForAllTheBook / neededDaysPerReadTheBook;

        System.out.println(neededHourReadPerDay);


    }
}
