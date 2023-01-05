package Car;

public class Minivan extends Car {
    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        changeGear();
    }
}
