package oopLecturePackage;

public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary() {//<--instance method. Will not be called in sep method but in object to access.
        System.out.printf("Cost: %d%nName: %s%nRecommended: %b", //<--%d for cents or decimal return. %s returns a string. %b placeholder for boolean
                this.costInCents,
                this.nameOfDish,
                this.wouldRecommend);//<--will work without 'this.'
    }

    public static void sayHowdy(){//<--sayHowdy can be called in different method bc it is "static"
        System.out.printf("Howdy!");
    }

    public static void main(String[] args) {
        Dish.sayHowdy();//<-- can access static method, not instance method.

        //make an object to access class
        //className.createObjectName = new className();
//        oopLecturePackage.Dish.dishObject = new oopLecturePackage.Dish();
//        System.out.print(dishObject.nameOfDish);
        //Create an object
//        DogHelper d = new DogHelper();
//        Dog sparky = new Dog();
    }
}
