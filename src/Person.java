

public class Person {
    private String name;

    public static void main(String[] args) {
        Person caroline = new Person("Caroline");
        caroline.sayHello();
        Person elaine = new Person("Elaine");
        elaine.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

    public Person(String newName) {
        this.name = newName;
    }

    ////TODO: return the person's name
    public String getName(){
        return this.name;
    }

//////TODO: change the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    ////TODO: print a message to the console using the person's name
    public void sayHello(){
        System.out.println("This is, " +this.name);
    }
}
