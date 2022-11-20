public class Car implements Drive{
    @Override
    public void driveOn() {
        // 100 lines of code (90% call private and protected)
        changeGear();
        // 100 lines of code
    }

    @Override
    public void driveOf()  {
        // 5 lines of code
        changeGear();
    }

    protected void changeGear()
    {
        // 30 lines of code
    }
    private double weiht;
}
