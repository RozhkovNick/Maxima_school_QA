package geometrypackage;

public class Men implements Shape {
    public Men(){
        weight = 0;
        growth = 0;
    }
    public Men (double weight, double growth){
        this.weight = weight;
        this.growth = growth;
    }

    @Override
    public double getArea() {
        return CONST*Math.pow(weight, 0.425)*Math.pow(growth, 0.725);}
        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        public void setGrowth(double growth) {
            this.growth = growth;
        }

        public double getGrowth() {
            return growth;
        }


    private double weight;
    private double growth;
    static final double CONST = 0.007184;
}
