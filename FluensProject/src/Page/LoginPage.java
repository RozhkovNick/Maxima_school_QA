package Page;

import Page.Credentials;
import Page.HomePage;

public class LoginPage {
    public LoginPage() {
    }

    public HomePage login(Credentials credentials) {
        return new HomePage();
    }

    public void login() {
    }
}
