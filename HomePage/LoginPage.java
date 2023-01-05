public class LoginPage extends BasePage {
    public void login(LoginData ld) {
        enterLogin(ld.getLogin());
        enterPassword(ld.getPassword());
        clickSubmitButton();
    }

    private void clickSubmitButton() {
    }
    private void enterPassword(String password) {
    }
    private void enterLogin(String login) {
    }
    public void login(Credentials cred) {
    }

    private WebElement login_eb = new WebElement("Login Edit box locator");
    private WebElement password_eb = new WebElement("Password Edit box locator");
    private WebElement submit_button = new WebElement("Submit Button Edit box locator");



}
