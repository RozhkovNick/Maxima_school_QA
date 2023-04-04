public class DogEat implements Change{
    private Change change;

    public DogEat() {
    }

    public DogEat(Change change) {
        this.change = change;
    }

    @Override
    public void sit() {
        if(change!=null)change.sit();
        System.out.println("Собака ест");
    }
}
