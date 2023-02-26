public class HigherEducationInstitution {
    private String diploma;
    private static HigherEducationInstitution higherEducationInstitution;

    private HigherEducationInstitution() {
        System.out.println("Диплом создан");
    }

    public static HigherEducationInstitution createDiploma() {
        if (higherEducationInstitution == null)
            higherEducationInstitution = new HigherEducationInstitution();
        return higherEducationInstitution;
    }

    public void insertDiploma(String info) {
        System.out.println("Новый диплом: " + info + " - создан");
        diploma = info;
    }
}
