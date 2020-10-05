package oopLecturePackage;

public class oopLect {//<--datatype is name of class. Class is oopLect
    public static void main(String[]args){
        Person rick1 = new Person();
        Person cindy = new Person();

        rick1.firstName = "Rick";//<--assign new values to default from package folder
        rick1.lastName = "Smith";

        System.out.println(rick1.firstName);

        rick1.firstName = "Ricky";//<--changes the initial variable value

        System.out.println(rick1.firstName);

        System.out.println(rick1.age);

        System.out.println(rick1);
        System.out.println(cindy);

        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());//<--()invokes the method sayHello from package folder "Person.java"

        Person justin = new Person();
        justin.firstName = "Justin";
        justin.lastName = "Reich";
        System.out.println(justin.sayHello());
    }


}
