package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5


        //this is a different way to condense code
//        Rectangle[] group = new Rectangle[2];
//
//        group[0] = new Rectangle(4, 5);
//
//        group[1] = new Square(5);
//        polymorph
//        for (Rectangle rect : group) {
//            System.out.println("rect.getArea() = " + rect.getArea());
//            System.out.println("rect.getPerimeter() = " + rect.getPerimeter());
//        }


        Rectangle box1 = new Rectangle(5, 4) {
            @Override
            public double getArea() {
                System.out.println("Square getPerimeter");
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        System.out.println("The perimeter of the rectangle is : " + box1.getPerimeter(4,5));
        System.out.println("The area of the rectangle is : " + box1.getArea(4,5));
        System.out.println("box1.isRectangle = " + box1.isRectangle());
//
////        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        //polymorph<--use the parent(super) class
        Rectangle box2 = new Square(5);
        System.out.println("box2.getArea() = " + box2.getArea(5,5));
        System.out.println("box2.getPerimeter() = " + box2.getPerimeter(5,5));
        System.out.println("box2.isRectangle = " + box2.isRectangle());
//        System.out.println("box2.isSquare = " + box2.isSquare());
    }
}
