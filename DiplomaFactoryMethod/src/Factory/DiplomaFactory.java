package Factory;

import Diploma.*;

public class DiplomaFactory {
    private CreateDiploma createDiploma;

    public DiplomaFactory(Type a) {
        switch (a) {
            case BACHELOR_BLUE:
                createDiploma = new BachelorBlueDiploma();
                break;
            case BACHELOR_RED:
                createDiploma = new BachelorRedDiploma();
                break;
            case MASTER_BLU:
                createDiploma = new MasterBlueDiploma();
                break;
            case MASTER_RED:
                createDiploma = new MasterRedDiploma();
                break;
            case SPECIALIST_BLU:
                createDiploma = new SpecialistBlueDiploma();
                break;
            case SPECIALIST_RED:
                createDiploma = new SpecialistRedDiploma();
                break;
        }

    }

    public CreateDiploma getCreateDiploma() {
        return createDiploma;
    }
}
