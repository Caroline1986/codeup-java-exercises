

public class Person {//<--a class needs a constructor. If not made..a default constructor will be made by intelij
    private String name;

    public static void main(String[] args) {//<--main can be placed at top(here) or below.
//        Person caroline = new Person("Caroline");//<--creates object with new instance of Person
//        System.out.println("caroline's name = " + caroline.getName()); //<--get's name
//        caroline.setName("Elaine");//<--sets a new name
//        caroline.sayHello();

//        Person elaine = new Person("Elaine");
//        elaine.sayHello();


//        Person person1 = new Person("John");//<--this is an object that is a string
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));//<--true because the names are the same
//        System.out.println(person1 == person2);//<--false because they are two different objects which gives them different reference ids

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());//<--John
        System.out.println(person2.getName());//<--John
        person2.setName("Jane");
        System.out.println(person1.getName());//<--Jane
        System.out.println(person2.getName());//<--Jane
    }

    public Person(String newName) {//<--constructor
        this.name = newName;//<--person object
    }

    ////TODO: return the person's name
    public String getName(){
        return this.name;
    }

    ////TODO: change the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    ////TODO: print a message to the console using the person's name
    public void sayHello(){
        System.out.println("This is, " +this.name);
        //or
        System.out.printf("This is %s", this.name);//<--use printf if using %s...
    }
}
