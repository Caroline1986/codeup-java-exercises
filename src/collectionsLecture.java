import java.util.ArrayList;

public class collectionsLecture {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());//<--size of ArrayList is 0
        names.add("Fernando");//<-- needs to be a string to match datatype. '.add' is used to add to an array
        System.out.println(names.size());//<--changes dynamically so ArrayList is now 1;
        names.add("Daniel");
        names.add("Kenneth");

        System.out.println("names.get(0) = " + names.get(0));//.get to get information inside of the array
//        System.out.println("names.get(1) = " + names.get(1));
        System.out.println("names.indexOf(\"Kenneth\") = " + names.indexOf("Kenneth"));

        System.out.println("names.get(2).toUpperCase() = " + names.get(2).toUpperCase());

        if (names.contains("Kenneth")) {//<--check if an element exists
            System.out.println("names.get(2) = " + names.get(names.indexOf("Kenneth")).toUpperCase());
        }
    }
}
