import java.util.Scanner;

public class stringsAndMethodsLec {
//    public static void main(String[] args) {
//        String email = "Fer@Codeup.Com".toLowerCase();
//        String studentEmail = "fer@gmail.com";
//        String dbEmail = " fer@codeup.com ".trim(); //<--use trim to remove white space.
//
//        if(email.endsWith("@codeup.com")){
//            System.out.println("You can see the grades sheet");
//        }else{
//            System.out.println("You are not allowed to see this file");
//        }
//        if(email.startsWith("fer".toLowerCase())){
//            System.out.println("");
//        }
//
//        if(studentEmail.endsWith("@codeup.com")){
//            System.out.println("You can see the grades sheet");
//        }else{
//            System.out.println("You are not allowed to see this file");
//        }
//        if(studentEmail.startsWith("fer".toLowerCase())){
//            System.out.println("");
//        }
//
//        System.out.println(email.charAt(0) == 'f');//<--is char at index '0' of 'String email' 'f'? True.
//
//        System.out.println(email.indexOf("@")); //<--- finds the index number
//        System.out.println(studentEmail.indexOf("@")); //<--
//
//        if(email.indexOf("@") > 0){ //<--if the index of '@' is greater than '0'
//            System.out.println("Email validation passed");
//        }else{
//            System.out.println("Email validation failed");
//        }
//
//        System.out.println("first index = " + email.indexOf("o"));//<--returns first index occurrence
//        System.out.println("first index = " + email.lastIndexOf("o")); //<--returns last occurrence
//
//        System.out.println("studentEmail.length() = " + studentEmail.length()); //<--returns number of characters
//        email = email.replace(".com", ".org");//<--replace .com with .org
//        System.out.println("org email = " + email);//<--returns new email
//
//        System.out.println("email.substring(0,2) = " + email.substring(0, 2));//<--takes indexes '0-2' but does not include '2'(last index), so it will return 'fe' (not fer)
////    }

    //begin methods lecture
//    public static returnType methodName([param1[, param2[, ...]]) { <-- format to declare method
//    // the statements of the method
//    // a return statement, if a return type is declared
//}
//        public static String hello (String name){ //<--if returnType is a string...
//            return ""; //<--return a string.
//        }
//


    public static void main(String[] args) {
//        System.out.println(sayHello("Fer"));
//        System.out.println(sum(1, 2));
//        to methods
//        printer(sayHello("Fer"));//<--creates printer method based on datatype
//        printer(sum(3, 4));//<--method overload by creating the same method with different datatype.
//        printer("ana");
//        printer(42);
////        printer("csv:", "cols, rows");
//        yesNo();
////        count(5); //<-- start from 5 and -1 until it reaches 0
////        System.out.println("getPower(2,3) = " + getPower(2, 3));
////
////        "caroline".lastIndexOf("c");
//    }
//
//    //    recursion...the ability for a method to call itself. Must have stopping point to avoid infinite loop.
//    public static void count(int n) { //<-- 5 -1 until it reaches 0
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }
//

//    public static boolean yesNo() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Continues? Yes/no");
//        if (scan.nextLine().equalsIgnoreCase("yes")) {
//            yesNo();
//        } else {
//            return false;
//        }

//    public static long getPower(int base, int exponent){
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//        }
        //or
//    public static long getPower(int base, int exponent){
//        if (exponent == 0){
//            return 1;
//        }else if (exponent == 1){
//            return base;
//        }else if (exponent == 2){
//            return base * base;
//        }
//        return base * getPower(base, exponent - 1);
//    }
//    public static String sayHello(String name) {
//        return String.format("Hello, %s!", name);
//    }
//
//    public static int sum(int num1, int numb2) {//<--return a number
//        return num1 + numb2;
//    }
//    private static void printer(String data) {
//        System.out.println("printing strings... = " + data);
//    }
//
//    //overloading the printer method
//    private static void printer(int data) {
//        System.out.println("printing numbers... = " + data);
//    }
//
//    //overloading with 2 params instead of 1
//    public static void printer(String prefix, String data) {
//        System.out.println(prefix + "printing strings with a prefix... = " + data);
    }

}