import java.util.Scanner;
import java.lang.*;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
//       Write some Java code that uses the variable pi to output the following
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f \n", pi);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer");
        int input = sc.nextInt();
        System.out.printf("Your number is %s.\n", input);



//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter three words.");
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();
        System.out.printf("%s %s %s.\n", first, second, third);
        sc.nextLine();

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.format("%s\n", sentence);


//        Prompt the user to enter values of length and width of a classroom at Codeup.
        System.out.println("Enter the length, width, and height of the classroom.");
        String inputStrLengthAndWidth = sc.nextLine();
        String[] strArr = inputStrLengthAndWidth.split(" ");
        double length = Double.parseDouble(strArr[0]);
        double width = Double.parseDouble(strArr[1]);
        double height = Double.parseDouble(strArr[2]);
//        Display the area and perimeter of that classroom.
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double volume = length * width * height;
        System.out.printf("%s\n", inputStrLengthAndWidth);
        System.out.printf("The area of the classroom is: %.2f.\n", area);
        System.out.printf("The perimeter of the classroom is: %.2f.\n", perimeter);
        System.out.printf("The volume of the classroom is: %.2f.\n", volume);

        System.out.println("Enter the length, width, and height of the classroom.");
        sc.useDelimiter("\n");
        String useDelimOutput = sc.next();
        System.out.printf("%s", useDelimOutput);
    }

}
