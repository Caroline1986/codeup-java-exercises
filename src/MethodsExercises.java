import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
// 1. Create four separate methods. Each will perform an arithmetic operation:
//Addition
        System.out.println("Add 27 + 5 = " + add(27, 5));
//Subtraction
        System.out.println("Subtract 90 from 30 = " + subtract(90, 30));
//Multiplication
        System.out.println("Multiply 6 and 6 = " + multiply(6, 6));
//Division
        System.out.println("Divide 9 and 56 = " + divide(9, 56));

        System.out.println("Find modulus of 9 and 36 = " + modulus(9, 36));

        getInteger(55, 1009);

        factorial(1);

    }

    private static int modulus(int i, int i1) {
        return i % i1;
    }

    private static int divide(int i, int i1) {
        return i / i1;
    }

    private static int multiply(int i, int i1) {
        return i * i1;
    }

    private static int subtract(int i, int i1) {
        return i - i1;
    }

    private static int add(int i, int i1) {
        return i + i1;
    }
//If the input is invalid, prompt the user again.

    public static int getInteger(int min, int max) {
        Scanner getInteger = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = getInteger.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Goodbye!");
            return userInput;
        } else {
            System.out.println("Try Again!");
            getInteger(min, max);
            return userInput;
        }
    }


//    3.Calculate the factorial of a number.
//
//Prompt the user to enter an integer from 1 to 10.
//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!).
//1! = 1               = 1
//2! = 1 x 2           = 2
//3! = 1 x 2 x 3       = 6
//4! = 1 x 2 x 3 x 4   = 24

    public static long factorial(long num1) {
        Scanner getNum = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        num1 = getNum.nextInt();
        System.out.println("Would you like to continue? [Press 1 for Yes | Press 2 for No]");
        int confirm = getNum.nextInt();
        String output = "! = 1";
        System.out.printf("1%s\n", output);

        boolean confirmation = (confirm == 1) && (num1 <= 10) && (num1 >= 1);
        if (confirmation) {
            long fact = 1;
            for (int i = 1; i <= num1; i++) {
                fact *= i;
                output += " X " + i;
                System.out.printf("%d%s = %d\n", i, output, fact);
            }
//            System.out.print(num1 + "! = " + fact);
//            return fact;
        } else {
            System.out.println("Make Sure 3 Things: Number between 1-10, Press 1 for Yes, Profit");
            factorial(num1);
        }
        return num1;
    }


}
