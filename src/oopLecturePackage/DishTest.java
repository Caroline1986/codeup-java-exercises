package oopLecturePackage;

import oopLecturePackage.Dish;

public class DishTest {
    public static void main(String[] args){
        Dish d = new Dish();
        d.costInCents = 2000;
        d.nameOfDish = "Mozzarella Sticks";
        d.wouldRecommend = false;
        d.printSummary();//<--will invoke method from oopLecturePackage.Dish.java
    }
}
