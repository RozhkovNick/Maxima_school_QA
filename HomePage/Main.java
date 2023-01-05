public class Main {
    public static void main(String[] args) {

        boolean result = HomePage.isImportantLabelAvaliable();

        Credentials cred = new Credentials("Some login", "Some password", "+3753333346120", "12345"); // A - 1
        LoginPage loginPage = new LoginPage();
        loginPage.login(cred); // A - 2

        if (result) {
            System.out.println("Login Tests: successful! With parameters: " + cred.toString());
        } else {
            System.out.println("Login Tests: failed!!! With parameters: " + cred.toString());
        }
    }
}