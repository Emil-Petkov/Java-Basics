package firstSteps;

import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int side_a = Integer.parseInt(scanner.nextLine());
        int side_b = Integer.parseInt(scanner.nextLine());

        int result = side_a * side_b;

        System.out.println(result);
    }
}