import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        String question = ("Sure.");
        String exclamation= ("Whoa, chill out!");
        String empty = ("Fine. Be that way!");
        String whatever = ("Whatever...");
        for (int i = 0; i <= 4; i++) {
            Scanner questionForBob = new Scanner(System.in);
            System.out.println("What would you like to say to Bob?: ");
            String userInput = questionForBob.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println(question);
            } else if (userInput.endsWith("!")) {
                System.out.println( exclamation);
            } else if (userInput.length() == 0) {
                System.out.println(empty);
            } else {
                System.out.println(whatever);
            }
        }
    }
}
