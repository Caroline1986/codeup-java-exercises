import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = 100 - 1 + 1;
        int numberToGuess = (int) ((Math.random() * range) + 1);
//        System.out.println("numberToGuess = " + numberToGuess);
        int counter = 0;
        while (true) {
            counter++;

            System.out.println("Guess a number between 1 and 100");
            short userInput = Short.parseShort(scan.nextLine());
            if (userInput > numberToGuess) {
                System.out.println("Go lower");
            } else if (userInput < numberToGuess) {
                System.out.println("Go higher");
            } else {
                System.out.println("You win");
                break;
            }
        }
        System.out.println("You guessed " + counter++ +" times.");
    }

}

