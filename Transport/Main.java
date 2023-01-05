import Car.*;
import Interface.Drive;
import Other.*;

import java.util.ArrayList;

public class Main {

    static public ArrayList<Drive> getEngines() {

        ArrayList<Drive> alDrices = new ArrayList<>(21);
        alDrices.add(new Car());
        alDrices.add(new Minivan());
        alDrices.add(new Minivan());
        alDrices.add(new Minivan());
        alDrices.add(new Bmw());
        alDrices.add(new Bmw());
        alDrices.add(new Sportage());
        alDrices.add(new Sportage());
        alDrices.add(new Track());
        alDrices.add(new Track());
        alDrices.add((Drive) new Pajero());
        alDrices.add((Drive) new Cruiser());

        alDrices.add(new Bike());
        alDrices.add(new Bike());
        alDrices.add(new Bike());
        alDrices.add(new Bike());

        alDrices.add(new Train());

        alDrices.add(new Bike());
        alDrices.add(new Bike());
        alDrices.add(new Bike());
        alDrices.add(new Bike());
        return alDrices;
    }

    public static void main(String[] args) {

        for (Drive engine : getEngines()) {
            engine.driveOn();
        }

        for (Drive engine : getEngines()) {
            engine.driveOf();
        }

    }
}