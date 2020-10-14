package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private String gitHubName;
    private ArrayList<Integer> grades = new ArrayList<>();



    public static void main(String[] args) {
        ArrayList<Integer> caroGrades = new ArrayList<>();
        Student caroline = new Student("Caroline", caroGrades, "Caroline1986");
        caroGrades.add(100);
        caroGrades.add(80);
        caroGrades.add(60);
        System.out.printf("%s's grades are: " + caroGrades + ".\n", caroline.name);
        System.out.printf("%s's average is: " + caroline.getGradeAverage(caroGrades), caroline.name);
    }

    public Student(String name, ArrayList<Integer> grades, String gitHubName) {
        this.name = name;
        this.grades = grades;
        this.gitHubName = gitHubName;
    }


    public String getName() {
        return this.name;
    }

    public String getGitHubName() {
        return this.gitHubName;
    }


    public double getGradeAverage(ArrayList<Integer> grades) {
        double sum = 0.0;
        if (!grades.isEmpty()) {
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
        return sum;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

}
