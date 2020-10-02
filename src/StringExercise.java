import java.sql.SQLOutput;

public class StringExercise {
    public static void main(String[] args) {
        String song = ("We don't need no education We don't need no thought control");
        System.out.println(song.substring(0, 26) + "\n" + (song.substring(27, 59)));
//        or
        System.out.println("We don't need no education.\nWe don't need no thought control");

        String inside = ("Check \"this\" out!, \"s inside of \"s!");
        System.out.println(inside);

        String windows = ("In windows, the main drive is usually C:\\");
        System.out.println(windows);

        String backslash = ("I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!");
        System.out.println(backslash);

    }
}
