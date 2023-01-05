package Menu;

public class Kitchen {
    private double water, fish, onion, carrot, potatoes, apple, orange, grape, pineapple;

    public Kitchen(double apple, double pineapple, double grape, double orange) {
        this.apple = apple;
        this.pineapple = pineapple;
        this.grape = grape;
        this.orange = orange;
    }

    public Kitchen(double apple, double pineapple, double grape) {
        this.apple = apple;
        this.pineapple = pineapple;
        this.grape = grape;
    }

    public Kitchen(double wather, double fish, double potatoes, double carrot, double onion) {
        this.water = wather;
        this.fish = fish;
        this.potatoes = potatoes;
        this.carrot = carrot;
        this.onion = onion;
    }

    public String getValues() {
        return "Ингридиенты: \n" + apple + "  " + pineapple + "  " + grape + "  " + orange;
    }
}
