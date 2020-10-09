package shapes;

public abstract class Rectangle {
    private boolean Rectangle;


    protected double width;
    protected double length;


    public Rectangle (double aLength, double aWidth){
        this.length = aLength;
        this.width = aWidth;
        this.Rectangle = true;
    }

    public double getArea (double length, double width){
        return length * width;//<--also use this.length * this.width. Same result.
    }

    public double getPerimeter (double length, double width){
        return (2 * length) + (2 * width);
    }

    public boolean isRectangle() {
        return Rectangle;
    }


    //check which method is being used
    public abstract double getArea();

    public abstract double getPerimeter();
}
