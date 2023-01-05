package Menu;

import java.sql.SQLOutput;

public class Soup extends Kitchen implements Show {
    public Soup(double water, double potatoes, double carrot, double onion) {
        super(water, potatoes, carrot, onion);
    }

    public Soup(double water, double fish, double potatoes, double carrot, double onion) {
        super(water, fish, potatoes, carrot, onion);
        System.out.println(getValues());
    }

    @Override
    public void info() {
    }

}
