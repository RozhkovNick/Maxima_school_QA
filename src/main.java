public class Main {
    public static void main(String[] args){
        Parameters me = new Parameters("Kolya","Rozhkov",31,"Fishing", 85.3f,180,"Higher");
        System.out.println( "My name is " + me.name + "\n" + "Lastname " + me.lastname + "\n" + "My age " + me.age);
        System.out.println("My Hobby - " + me.hobby + "\n" + "My weight - " + me.weight);
        System.out.println("My height - " + me.height + "\n" + "Me education - " + me.education);
    }
}
