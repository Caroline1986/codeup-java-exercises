import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//<-- declare scanner here to be called in methods below main.


// 1. Create four separate methods. Each will perform an arithmetic operation:
//Addition
        System.out.println("Add 27 + 5 = " + add(27, 5));
//        to test will return a boolean of true or false--> System.out.println("(32 == add(27,5)) = " + (32 == add(27,5)));
//Subtraction
        System.out.println("Subtract 90 from 30 = " + subtract(90, 30));
//Multiplication
        System.out.println("Multiply 6 and 6 = " + multiply(6, 6));
//Division
        System.out.println("Divide 9 and 56 = " + divide(9, 56));

        System.out.println("Find modulus of 9 and 36 = " + modulus(9, 36));

//        getInteger(55, 1009);
//
        factorial(1);

        rollDice(scan);

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
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = Integer.parseInt(scan.nextLine());

        if (userInput < min) {
            System.out.println("This number isi lower than " + min);
            return getInteger(min, max);//<--return for recursion. Call method inside of same method
        }else if (userInput > max) {
            System.out.println("This is bigger than " + max);
            return getInteger(min, max);
        }
        return userInput;
    }

//    public static int getInteger(int min, int max) {
//        Scanner getInteger = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int userInput = getInteger.nextInt();

//        if (userInput >= min && userInput <= max) {
//            System.out.println("Goodbye!");
//            return userInput;
//        } else {
//            System.out.println("Try Again!");
//            getInteger(min, max);
//            return userInput;
//        }
//    }


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
            System.out.println(num1 + "! = " + fact);
            return fact;
        } else {
            System.out.println("");
            factorial(num1);
        }
        return num1;
    }




//if scanner declared in main... call it in method function. ex:
    public static void randomize(short sides) {
        System.out.println( (int) Math.floor(Math.random() * sides) ); //<--(int) casts number to multiply by one so it isn't a decimal
        System.out.println( (int) Math.floor(Math.random() * sides) );
    }
 public static void rollDice(Scanner scan) {
        int counter = 0;
        while(true){
            counter++; //<--checks to see how many times rolled
            System.out.println("Roll dice method");
            System.out.println("Number of sides: ");
            short sides = Short.parseShort(scan.nextLine());
            randomize(sides);
            System.out.println("continue? y/n");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("bye");
            }
        }
 }


            public static void rollDice() {
                Scanner scDice = new Scanner(System.in);
                long output = 0;
                while (true) {
                    System.out.printf("How many sides does each die have? \t");
                    long userDiceInput = scDice.nextLong();
                    long die1 = randomLong(1, userDiceInput);
                    long die2 = randomLong(1, userDiceInput);
                    System.out.printf("Die 1: %d\nDie 2: %d\nRoll: %d\n", die1, die2, die1 + die2);
                    System.out.print("roll again?");
                    String rollAgain = scDice.next();
                    if (rollAgain.equalsIgnoreCase("no")) {
                        output = die1 + die2;
                        break;
                    };
                };
            }

    public static long randomLong(long left, long right) {
        return left + (long) (Math.random() * (right - left));
    }


}
