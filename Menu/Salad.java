package Menu;

public class Salad extends Kitchen implements Show {
    public Salad(double apple, double pineapple, double grape, double orange) {
        super(apple, pineapple, grape, orange);
        System.out.println(getValues());
    }

    public Salad(double apple, double pineapple, double grape) {
        super(apple, pineapple, grape);
    }

    @Override
    public void info() {
        System.out.println("Салатик");
    }
}
