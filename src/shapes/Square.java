package shapes;

public class Square extends Quadrilateral {
    //    Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.
//    protected double length;
//    protected double width;

    public Square(double side) {
        super(side, side);
    }


    @Override
    void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}


