package Menu;

public class salad extends Kitchen implements show {
    public salad(){}

    public salad(double apple, double pineapple, double grape, double orange) {
        super(apple, pineapple, grape, orange);
        System.out.println(getValues());
    }

    public salad(double apple, double pineapple, double grape) {
        super(apple, pineapple, grape);
        System.out.println("Салат готов");

    }

    @Override
    public void Info() {
        System.out.println("Салатик");
    }
}
