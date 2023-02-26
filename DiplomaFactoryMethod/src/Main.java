import Factory.DiplomaFactory;
import Factory.Type;

public class Main {
    public static void main(String[] args) {
        DiplomaFactory diplomaFactory = new DiplomaFactory(Type.MASTER_BLU);
        diplomaFactory.getCreateDiploma().diploma();
    }
}
