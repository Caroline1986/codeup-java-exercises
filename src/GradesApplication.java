import grades.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        ArrayList<ArrayList<Integer>> allGrades = new ArrayList<>();

        ArrayList<Integer> homer = new ArrayList<>();
        homer.add(70);
        homer.add(75);
        homer.add(74);
        Student simpson = new Student("Simpson, Homer", homer, "Mr. Plow");
        students.put("Homer", simpson);
        allGrades.add(0, homer);

        ArrayList<Integer> montgomery = new ArrayList<>();
        montgomery.add(100);
        montgomery.add(110);
        montgomery.add(90);
        Student burns = new Student("Burns, Montgomery", montgomery, "MontyBillions");
        students.put("Montgomery", burns);
        allGrades.add(1, montgomery);

        ArrayList<Integer> robert = new ArrayList<>();
        robert.add(100);
        robert.add(110);
        robert.add(90);
        Student terwilliger = new Student("Terwilliger, Robert", robert, "SideshowB");
        students.put("Robert", terwilliger);
        allGrades.add(2, robert);

        ArrayList<Integer> margaret = new ArrayList<>();
        margaret.add(100);
        margaret.add(110);
        margaret.add(90);
        Student babySimpson = new Student("Simpson, Margaret", margaret, "Maggie");
        students.put("Margaret", babySimpson);
        allGrades.add(3, margaret);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome\n Here are the GitHub usernames of our students:");
        System.out.println("|" + students.get("Homer").getGitHubName() + "| |" + students.get("Montgomery").getGitHubName() + "| |" + students.get("Robert").getGitHubName() + "| |" + students.get("Margaret").getGitHubName() + "|");
        System.out.println("What student would you like more information on? Enter \"All\" to view the class average: ");
        String userInput = scanner.nextLine();
            while (true) {
                if (userInput.toLowerCase().equals("all")){
                    System.out.println("The class average is " + allGrades);
                }
                if (userInput.toLowerCase().equals("Mr.Plow")) {
                    System.out.println("Name: \n" + students.get("Homer").getName() + "- Grades: \n" + students.get("Homer").getGrades(),"\n" + "Grade Average: \n" + students.get("Homer").getGradeAverage("simpson"));
                }
            }
    }
}

