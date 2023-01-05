package Car;

public class Track extends Car {
    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        changeGear();
    }

    @Override
    public void driveOf() {
        super.driveOf();
        changeGear();
    }
}