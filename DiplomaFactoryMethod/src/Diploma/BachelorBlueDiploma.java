package Diploma;

import java.sql.SQLOutput;

public class BachelorBlueDiploma implements CreateDiploma {
    @Override
    public void diploma() {
        System.out.println("Создан синий диплом бакалавра.");
    }
}
