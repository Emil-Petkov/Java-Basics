package firstSteps;

import java.util.Scanner;

public class concatenateData {
    public static void main(String[] args) {

        //You are <firstName> <lastName>, a <age>-years old person from <town>.

        Scanner scanner = new Scanner(System.in);

        String fName = scanner.nextLine();
        String lName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", fName, lName, age, town);

    }
}
