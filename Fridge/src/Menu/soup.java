package Menu;

import java.sql.SQLOutput;

public class soup extends Kitchen implements show{
    public soup(){}
    public soup(double water, double fish,double potatoes, double carrot, double onion) {
    super(water,fish,potatoes,carrot,onion);
        System.out.println(getValues());

    }

    @Override
    public void Info() {

    }
}
