package Menu;

public class Main {
    public static void main(String[] args) {
        Salad fruit = new Salad(2, 2, 2, 3);
        Soup uha = new Soup(2.3, 2, 3.5, 1, 1);
        Salad veg = new Salad(2, 3, 4);
        Soup borsch = new Soup(1.2, 2, 3, 4);
        veg.info();
    }
}
