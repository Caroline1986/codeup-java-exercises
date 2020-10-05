package oopLecturePackage;

import javax.sound.midi.Soundbank;

public class Person {
    public String firstName = "Unknown";//<--add what variable ='s to avoid null...will get "unknown" instead
    public String lastName;
    public int age;

    public String sayHello(){
        return lastName + ", " + firstName + " says hi!";
    }

    public class Dog {
        public String name;
        public String breed;
        public boolean canBreed;
        public int age;

        public void callForDog(String name){
            if (name.equalsIgnoreCase(this.name)) {//<--this. is for the instance propperty and not perameter
                System.out.println(this.name + " is now walking towards you.");
            }else {
                System.out.println(this.name + " ignores you");
            }
        }
    }
}
//public static void main(String[]args){
//        can add main method in package folder
//        }
