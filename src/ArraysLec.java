import javax.lang.model.SourceVersion;
import java.util.Arrays;

public class ArraysLec {
    public static void main(String[] args) {

        double[] prices = new double[3];//<--3 is the largest the array can be.

        // Variables that hold a value or values can be entered to array

        prices[0] = Double.parseDouble("1.0");//<--add a decimal .0 because it is double. parse a string to a number
        prices[1] = 2.0;//--- = value inside of specified index.
        prices[2] = 3.0 * 2;//---we are able to change the value of the index

        System.out.println("prices = " + prices.length);//<--will display how many items the array was created for
        System.out.println("prices[0] = " + prices[0]);
        System.out.println("prices[2] = " + prices[2]);

        ///loop ex. for prices//
        for (int i = 0; i < prices.length; i++) {
            System.out.println("prices[i] = " + prices[i]);
        }

        ///names example///
        String[] names = {"Fer", "Douglas", "Daniel"};//<--use curly braces to initialize an array
        System.out.println("names = " + names.length);//<--size gets automatically assigned by numb of items = 3

        Person[] persons = new Person[2];

        persons[0] = new Person("Fer");//<--datatype = Person object
        persons[1] = new Person("Nando");

        int[] numbers = new int[8];
        int[] otherNumbers = new int[8];

        //enhanced loop vvv//
        for (String name : names) { //<--from the list of names create a name
            System.out.println("name = " + name);
        }

        ///to sort//
        Arrays.sort(prices);//<--sorts arrays
        Arrays.sort(names);

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));//<--sorts arrays
        System.out.println("Arrays.toString(prices) = " + Arrays.toString(prices));


        Arrays.fill(numbers, 10);//<---"fill" is a pre-made java class to fill an array
        Arrays.fill(otherNumbers, 10);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.equals(numbers, otherNumbers) = " + Arrays.equals(numbers, otherNumbers));
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

//        String[] copyOfNames = new String[names.length + 1];//<--this is the same as bottom ex of copy but we will need to enter in names manually.
        String[] copyOfNames = Arrays.copyOf(names, names.length);

        System.out.println("copyOfNames.length = " + copyOfNames.length);
//        copyOfNames[3] = "Justin";
        System.out.println("Arrays.toString(copyOfNames) = " + Arrays.toString(copyOfNames));

        //visualize as a spreadsheet with an x(horizontal) and y(vertical) axis
        int[][] matrix = {//<--first square is for "x".. 2nd is for "y"
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //to access first element in the second row
        System.out.println(matrix[1][0]);//4

        for (int[] row : matrix) {
            System.out.println("---+---+---+");

            for (int cell : row) {
                System.out.println(cell + " | ");
            }

            System.out.println();
        }

//        for (int x = 0; x < matrix.length; x++) {
//
//        }
        System.out.println("---+---+---+");

        for (Person person : persons){//<--reference persons in main
            person.sayHello();//<--grabbed from different package in Person
        }
    }
}
