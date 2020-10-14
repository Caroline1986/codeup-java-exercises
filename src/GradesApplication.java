import grades.Student;
import util.Input;
import java.util.HashMap;
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student caroline = new Student("Caroline");
        Student homer = new Student("Homer");
        caroline.addGrade(100);
        caroline.addGrade(80);
        caroline.addGrade(60);

        homer.addGrade(70);
        homer.addGrade(75);
        homer.addGrade(74);
        System.out.printf("%s's average is: " + caroline.getGradeAverage(), caroline);
        System.out.printf("%s's average is: " + homer.getGradeAverage(), homer);


//        ArrayList<ArrayList<Integer>> allGrades = new ArrayList<>();

        students.put("Carolaine", caroline);
        students.put("Mr. Plow", homer);

        cli(students);
    }

    public static void cli(HashMap<String, Student> students) {
        Input input = new Input();
        System.out.println("Welcome\n" +
                "\n" +
                "Here are the GitHub usernames of our students: ");

        for (String ghUsername : students.keySet()) {
            System.out.println(ghUsername + " ");
        }

        do {
            System.out.println("What student would you like to see more info on?\n");
            String keyTyped = input.getString();
            if (students.containsKey(keyTyped)) {
                System.out.printf("Name: %s - GitHub Username: %s\n" + "Current Average: %f\n", students.get(keyTyped).getName(), keyTyped, students.get(keyTyped).getGradeAverage());
            } else {
                System.err.println("Sorry, the username, " + keyTyped + ", does not exist.");
            }
        } while (input.yesNo("Would you like to see another student? Y/N"));
    }
}


//
//        ArrayList<Integer> homer = new ArrayList<>();
//        homer.add(70);
//        homer.add(75);
//        homer.add(74);
//        Student simpson = new Student("Simpson, Homer", homer, "Mr. Plow");
//        students.put("Homer", simpson);
//        allGrades.add(0, homer);
//
//        ArrayList<Integer> montgomery = new ArrayList<>();
//        montgomery.add(100);
//        montgomery.add(110);
//        montgomery.add(90);
//        Student burns = new Student("Burns, Montgomery", montgomery, "MontyBillions");
//        students.put("Montgomery", burns);
//        allGrades.add(1, montgomery);
//
//        ArrayList<Integer> robert = new ArrayList<>();
//        robert.add(100);
//        robert.add(110);
//        robert.add(90);
//        Student terwilliger = new Student("Terwilliger, Robert", robert, "SideshowB");
//        students.put("Robert", terwilliger);
//        allGrades.add(2, robert);
//
//        ArrayList<Integer> margaret = new ArrayList<>();
//        margaret.add(100);
//        margaret.add(110);
//        margaret.add(90);
//        Student babySimpson = new Student("Simpson, Margaret", margaret, "Maggie");
//        students.put("Margaret", babySimpson);
//        allGrades.add(3, margaret);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome\n Here are the GitHub usernames of our students:");
//        System.out.println("|" + students.get("Homer").getGitHubName() + "| |" + students.get("Montgomery").getGitHubName() + "| |" + students.get("Robert").getGitHubName() + "| |" + students.get("Margaret").getGitHubName() + "|");
//        System.out.println("What student would you like more information on? Enter \"All\" to view the class average: ");
//        String userInput = scanner.nextLine();
//            while (true) {
//                if (userInput.toLowerCase().equals("all")){
//                    System.out.println("The class average is " + allGrades);
//                }
//                if (userInput.toLowerCase().equals("Mr.Plow")) {
//                    System.out.println("Name: \n" + students.get("Homer").getName() + "- Grades: \n" + students.get("Homer").getGrades(),"\n" + "Grade Average: \n" + students.get("Homer").getGradeAverage("simpson"));
//                }
//            }
//}
//}
