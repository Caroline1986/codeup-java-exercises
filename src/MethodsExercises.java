public class MethodsExercises {
    public static void main(String[] args) {
// 1. Create four separate methods. Each will perform an arithmetic operation:
//a.
//Addition
        System.out.println("Add 27 + 5 = " + add(2, 5));
//Subtraction
        System.out.println("Subtract 90 from 30 = " + subtract(90, 30));
//Multiplication
        System.out.println("Multiply 6 and 6 = "  + multiply(6, 6));
//Division

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
}
