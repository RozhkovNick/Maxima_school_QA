package geometrypackage;

public class Triangle implements Shape {
    private double length;
    private double high;

    public Triangle(double length, double high) {
        this.length = length;
        this.high = high;
    }

    @Override
    public double getArea() {
        return (length * high) / 2;
    }
}
