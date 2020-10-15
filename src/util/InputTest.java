package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//
//        if(input.yesNo())
//            System.out.println("This returned a true");
//        else
//            System.out.println("False");

        System.out.println(input.getInt(35, 500));
        System.out.println(input.getInt(input.getInt("Input a min number."), input.getInt("Input a max number.")));
        System.out.println("Start getDouble");
        System.out.println(input.getDouble(input.getDouble("Input a min double"), input.getDouble("Input a max double.")));
        System.out.println("End");
    }
}
