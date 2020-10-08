package movies;
import util.Input;


public class MoviesApplication {



    public static void main(String[] args) {
        Input input = new Input();//<--creates a new instance of input
        Movie[] movieDataBase = MoviesArray.findAll();
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" + "\n");

        while (true)
        switch (input.getInt("Enter your choice: ")) {//<--getInt from pevious exercise
            case 0:
                return;//<--or--> System.exit(0);
            case 1:
                for (Movie movie : movieDataBase) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                break;

            case 2:
                for (Movie movie : movieDataBase) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                break;

            case 3:
                for (Movie movie : movieDataBase) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                break;

            case 4:
                for (Movie movie : movieDataBase) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                break;

            case 5:
                for (Movie movie : movieDataBase) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
//                        printMoviesByCategory("scifi");<--use alternate method
                    }
                }
                break;
        }
    }

//    public static void printMoviesByCategory(String category) {
//        Movie[] movieDataBase = MoviesArray.findAll();
//        for (Movie movie : movieDataBase) {
//            if (movie.getCategory().equalsIgnoreCase(category)) {
//                System.out.println(movie.getName() + " -- " + movie.getCategory());
//            }
//        }

//    }
}
