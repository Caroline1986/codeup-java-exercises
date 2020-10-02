public class stringsLec {
    public static void main(String[] args) {
        String email = "Fer@Codeup.Com".toLowerCase();
        String studentEmail = "fer@gmail.com";
        String dbEmail = " fer@codeup.com ".trim(); //<--use trim to remove white space.

        if(email.endsWith("@codeup.com")){
            System.out.println("You can see the grades sheet");
        }else{
            System.out.println("You are not allowed to see this file");
        }
        if(email.startsWith("fer".toLowerCase())){
            System.out.println("");
        }

        if(studentEmail.endsWith("@codeup.com")){
            System.out.println("You can see the grades sheet");
        }else{
            System.out.println("You are not allowed to see this file");
        }
        if(studentEmail.startsWith("fer".toLowerCase())){
            System.out.println("");
        }

        System.out.println(email.charAt(0) == 'f');//<--is char at index '0' of 'String email' 'f'? True.

        System.out.println(email.indexOf("@")); //<--- finds the index number
        System.out.println(studentEmail.indexOf("@")); //<--

        if(email.indexOf("@") > 0){ //<--if the index of '@' is greater than '0'
            System.out.println("Email validation passed");
        }else{
            System.out.println("Email validation failed");
        }

        System.out.println("first index = " + email.indexOf("o"));//<--returns first index occurrence
        System.out.println("first index = " + email.lastIndexOf("o")); //<--returns last occurrence

        System.out.println("studentEmail.length() = " + studentEmail.length()); //<--returns number of characters
        email = email.replace(".com", ".org");//<--replace .com with .org
        System.out.println("org email = " + email);//<--returns new email

        System.out.println("email.substring(0,2) = " + email.substring(0, 2));//<--takes indexes '0-2' but does not include '2'(last index), so it will return 'fe' (not fer)
    }
}
