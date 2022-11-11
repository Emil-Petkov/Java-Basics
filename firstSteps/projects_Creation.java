package firstSteps;

import java.util.Scanner;

public class projects_Creation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."


        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());

        int neededTime = projects * 3; //hours

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, neededTime, projects);
    }
}
