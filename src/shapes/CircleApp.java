package shapes;

import util.Input;

public class CircleApp {
    private static int numCircles = 0;//<--work on bonus here

    public static void main(String[] args) {
        Input input = new Input();
        do {
            double radius = input.getDouble(0, 100000);
            Circle pizza = new Circle(radius);
            System.out.println("pizza.getCircumference() = " + pizza.getCircumference());
            System.out.println("pizza.getArea() = " + pizza.getArea());
        } while (input.yesNo("Continue"));
        System.out.printf("You created %d circles.", Circle.circleCount);
    }
}
