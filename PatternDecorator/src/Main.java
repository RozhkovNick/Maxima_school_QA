public class Main {
    public static void main(String[] args) {
        Change dogSit = new DogSit();
        Change dogEat = new DogEat(dogSit);
        Change dogBark = new DogBark(dogEat);
        sendChange(dogBark);
    }
    private static void sendChange(Change change){
        change.sit();
    }
}
