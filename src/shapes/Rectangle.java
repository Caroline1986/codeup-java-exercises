package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


     Rectangle(double aLength, double aWidth) {
        super(aLength, aWidth);
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {//<--part of implementing the measurable interface
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }


}
