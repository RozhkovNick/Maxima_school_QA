package Menu;


import java.security.PublicKey;

public class Kitchen  {
    public Kitchen(){}
    private double water,fish,onion,carrot,potatoes,apple, orange, grape, pineapple;
//    private boolean cleaning;

    public Kitchen(double apple, double pineapple, double grape, double orange) {
        this.apple = apple;
        this.pineapple = pineapple;
        this.grape = grape;
        this.orange = orange;
    }
    public String getValues() {
        return "Ингридиенты: \n" + apple + "  " + pineapple + "  "  + grape + "  " + orange;}



    public Kitchen(double apple, double pineapple, double grape) {
        this.apple = apple;
        this.pineapple = pineapple;
        this.grape = grape;
//        System.out.println(info);
    }
    public void Frukt(){
        System.out.println("Всего " + this.apple  );
    }

    public Kitchen(double wather, double fish, double potatoes, double carrot, double onion) {
        this.water = wather;
        this.fish = fish;
        this.potatoes = potatoes;
        this.carrot = carrot;
        this.onion = onion;

    }

//    public void setValues(double apple, double pineapple, double grape, double orange) {
//        this.apple = apple;
//        this.pineapple = pineapple;
//        this.grape = grape;
//        this.orange = orange;
//    }




//    public void setValues(double wather, double fish, double potatoes, double carrot, double onion) {
//        this.wather = wather;
//        this.fish = fish;
//        this.potatoes = potatoes;
//        this.carrot = carrot;
//        this.onion = onion;
//    }
    public String gtValues(){
        String info1 = "Ингридиенты: \n" + water + fish + potatoes + carrot + onion;
        return info1;}
}
