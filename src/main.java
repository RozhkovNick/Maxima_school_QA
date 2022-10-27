import java.sql.SQLOutput;

public class main {
    public static void main(String[] args){
    parameters me = new parameters();
    me.name = "Kolya";
    me.lastname = "Rozhkov";
    me.age = 30;
    me.hobby = "Fishing";
    me.weight = 85.3f;
    me.height = 181.9f;
    me.education = "Higher";
        System.out.println( "My name is " + me.name + "\n" + "Lastname " + me.lastname + "\n" + "My age " + me.age);
        System.out.println("My Hobby - " + me.hobby + "\n" + "My weight - " + me.weight);
        System.out.println("My height - " + me.height + "\n" + "Me education - " + me.education);
    }
}