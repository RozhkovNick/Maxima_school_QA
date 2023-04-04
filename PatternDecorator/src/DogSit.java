public class DogSit implements Change {
    private Change change;

    public DogSit() {
    }

    public DogSit(Change change) {
        this.change = change;
    }

    @Override
    public void sit(){
        if(change!=null)change.sit();
        System.out.println("Собака сидит");
    }
}
