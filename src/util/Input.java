package util;

import java.util.Scanner;

public class Input {
//    public static void main(String[] args) {
//
//    }

    //    When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class
    private Scanner scanner;//<--instance

    public Input() {//<--constructor
        this.scanner = new Scanner(System.in);//<-- created object with new instance of Scanner class
    }

    public String getString() {
        System.out.println("Enter a string ");
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        return yesNo("Enter yes or no");
    }

    public boolean yesNo(String prompt){
        System.out.println("Yay or Nay?");
        String userInput = this.scanner.next();
        return userInput.trim().equalsIgnoreCase("yay") || userInput.trim().toLowerCase().equals("y");
    }

    public int getInt(int min, int max) {
//        while(true) {
//            System.out.printf("Enter an integer between %f and %d", min, max);
//        String input = scanner.nextLine();
//        int num = Integer.parseInt(input);
//        if (num >= min&& num<= max);
//            return num;
//        }
        //orrrr

//        public int getInt(int min, int max){
//            return getInt(min, max, "Enter an integer between" +min+" and "+max+");
//        }

        int userInput;
        do {
            System.out.print("Enter a number between " + min + " and " + max);
            userInput = this.scanner.nextInt();
        } while (min <= userInput && max >= userInput);
        return userInput;
    }

    public int getInt(){
        return  getInt("Please enter a number");
    }
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        String input = scanner.nextLine();
//        int num = Integer.parseInt(input);
//        return num;
//    }

    public int getInt(String prompt) {
        boolean loopAgain = true;
        int output = 0;
        do {
            try {
                System.out.printf("%s\n", prompt);
                output = Integer.valueOf(this.scanner.next());
                loopAgain = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (loopAgain);
        return output;
    }


    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.print("Enter a number between " + min + " and " + max);
            userInput = this.scanner.nextDouble();
        } while (min <= userInput && max >= userInput);
        return userInput;
    }

//    public double getDouble() {
//        System.out.print("Enter a number");
//        String input = scanner.nextLine();
//        return this.scanner.nextDouble();
//    }
    public double getDouble(String prompt) {
        boolean loopAgain = true;
        double output = 0;
        do {
            try {
                System.out.printf("%s\n", prompt);
                output = Double.valueOf(this.scanner.next());
                loopAgain = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (loopAgain);
        return output;
    }


    }
