package geometrypackage;

public class Men implements Shape {
    static final double CONST = 0.007184;
    private double weight;
    private double growth;

    public Men(double weight, double growth) {
        this.weight = weight;
        this.growth = growth;
    }

    @Override
    public double getArea() {
        return CONST * Math.pow(weight, 0.425) * Math.pow(growth, 0.725);
    }
}
