package geometrypackage;

public class triangle implements Shape{
    public triangle (){
        length = 0;
        high = 0;
    }
    public triangle(double length, double high){
        this.length = length;
        this.high = high;
    }
    private double length;
    private double high;

    @Override
    public double getArea() {
        return (length * high)/2;}
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

}
