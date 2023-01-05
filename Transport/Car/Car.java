package Car;

import Interface.Drive;

public class Car implements Drive {
    @Override
    public void driveOn() {
        changeGear();
    }

    @Override
    public void driveOf() {
        changeGear();
    }

    protected void changeGear() {
    }
}
