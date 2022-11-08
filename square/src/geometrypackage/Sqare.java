package geometrypackage;

public class Sqare implements Shape{

    public Sqare(){
        length = 0;
    }

    public Sqare(double _length){
        length = _length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    private double length;
}
