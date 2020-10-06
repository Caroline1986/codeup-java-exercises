package oopLecturePackage;


public class DishTools {
    //        - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000 (use the final keyword to make it a constant)
    public final static int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

    public static void main(String[]args){

    }

    //- shoutDishName() - that takes in a Dish object and prints out the name in all caps
    public static void shoutDishName(Dish d) {
        System.out.println("The name of the dish is " + d.nameOfDish.toUpperCase());
    }

    //       - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
    public static void analyzeDishCost(Dish d) {
       String message = (d.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS) ?
           "This dish is more expensive than average." :
   "This dish is less expensive than average.";
        System.out.println(message);
    }

//          - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
    public static void flipRecommendation(boolean dishObj){

    }
}
