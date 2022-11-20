// Todo: think about how to add Track, Jeep

import java.util.ArrayList;

public class Main {

    static public ArrayList<Drive> getEngines(){

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
        alDrices.add(new Pajero());
        alDrices.add(new Cruiser());

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