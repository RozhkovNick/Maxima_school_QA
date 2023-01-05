package geometrypackage;

public class Rectangle implements Shape {
    private double length;
    private double high;

    public Rectangle(double length, double high) {
        this.length = length;
        this.high = high;
    }

    @Override
    public double getArea() {
        return length * high;
    }
}