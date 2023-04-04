public class DogBark implements Change{
    private Change change;

    public DogBark() {
    }

    public DogBark(Change change) {
        this.change = change;
    }

    @Override
    public void sit() {
        if(change!=null)change.sit();
        System.out.print("Собака лает");
    }
}
