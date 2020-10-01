import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//1.a. Create an integer variable i with a value of 5.
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.
//Your output should look like this:
//
//5 6 7 8 9 10 11 12 13 14 15

//1.bCreate a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 5;
//        while (i <= 15) {
//            System.out.print("i = " + i);
//            i++;
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        make previous 2 into for loop
//        for(int counter = 100; counter >= -10; counter -= 5) {
//            System.out.println(counter);
//        }
//


//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

//        make into for loop
//        for(long i = 2; i <= 10000000; i*=i) {
//            System.out.println(i);
//        }


//       2. Write a program that prints the numbers from 1 to 100.
//For multiples of three: print “Fizz” instead of the number.
//For the multiples of five: print “Buzz”.
//For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for(int i = 1; i <= 100; i++){
//            if(i % 5 == 0 && i % 3 == 0)
        //or can use--->if (i % 25 == 0)
//                System.out.println("FizzBuzz");
//            else if(i % 5 == 0)
//                System.out.println("Buzz");
//            else if(i % 3 == 0)
//                System.out.println("Fizz");
//            else
//                System.out.println(i);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        long userLowNumber = sc.nextLong();
//        System.out.println("What number would you like to go to? ");
//        long userHighNumber = sc.nextLong();
//
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//            for (long i = userLowNumber; i <= userHighNumber; i++) {
//                long inputSquared = i * i;
//                double inputCubed = Math.pow(i, 3);
//                System.out.printf("%-6d | %-7d | %,.0f%n", i, inputSquared, inputCubed);
//        }


//        Scanner scTwo = new Scanner(System.in);
//        System.out.println("Enter a grade from 0 to 100: ");
//        int grade = scTwo.nextInt();
//        System.out.println("Would you like to continue? [y/N]");
//        String input = scTwo.next();
//        boolean confirmation = input.equals("y");
//        int i = grade;
//        if (confirmation) {
//            if (i < 0) {
//                System.out.println("F-!!");
//            } else if (i <= 59) {
//                System.out.println("F!");
//            } else if (i <= 61) {
//                System.out.println("D-!");
//            } else if (i <= 64) {
//                System.out.println("D!");
//            } else if (i <= 66) {
//                System.out.println("D+!");
//            } else if (i <= 68) {
//                System.out.println("C-!");
//            } else if (i <= 77) {
//                System.out.println("C!");
//            } else if (i <= 79) {
//                System.out.println("C+!");
//            } else if (i <= 81) {
//                System.out.println("B-!");
//            } else if (i <= 85) {
//                System.out.println("B!");
//            } else if (i <= 87) {
//                System.out.println("B+!");
//            } else if (i <= 89) {
//                System.out.println("A-!");
//            } else if (i <= 98) {
//                System.out.println("A!");
//            } else if (i <= 100) {
//                System.out.println("A+!");
//            } else if (i >= 101) {
//                System.out.println("President");
//            } else {
//                System.out.println("N/A");
//            }
//        }

    }
}