import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//      What happens when you run the following code? Why is Arrays.toString necessary?
        //System.out.println(numbers);
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
        Person[] people = {//<--Person comes from package already created from precious exersices
                new Person("Elaine"),
                new Person("Johnny"),
                new Person("Bubbles")
                //or//

//                Person [] people = new Person[3];
//                people[0] = new Person("Fer");
//                people[1] = new Person("Ana");
//                people[2] = new Person("Betty");
        };
// Iterate through the array and print out the name of each person in the array
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
        ////or///
        for (Person p : people) {
            System.out.println("p.getName() = " + p.getName());
        }

//        Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array.
        people = addPerson(people, new Person("LilLatte"));
        for (Person person : people) {
            System.out.println(person.getName());//<--from Person class exercise

            //or...reference example from fer//
//            Person[] newArray = addPerson(people, new Person("Teddy"));
//            for (Person aPerson : newArray){
//                System.out.println();
//            }
        }
    }
//     It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
     public static Person[] addPerson (Person[] people, Person addPerson){
            Person[] newPeople = Arrays.copyOf(people, people.length + 1);
            newPeople[people.length] = addPerson;
            return newPeople;


        }
    }

