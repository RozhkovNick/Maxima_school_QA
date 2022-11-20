public class Track extends Car{
    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        // + 150 special lines due to AWD
        changeGear();
    }

    @Override
    public void driveOf()  {
        super.driveOf();
        changeGear();
        // + 20 special lines due to AWD
    }
}