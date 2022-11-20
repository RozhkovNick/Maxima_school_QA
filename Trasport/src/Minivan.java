public  class Minivan extends Car{
    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        // + 10 special lines due to AWD
        changeGear();
    }


    /*
    @Override
    public void driveOf() throws Exception {
        super.driveOf();
        changeGear();
        // + 2 special lines due to AWD
    }
     */
}
