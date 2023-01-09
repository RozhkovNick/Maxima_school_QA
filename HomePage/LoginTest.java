import java.io.File;
import org.junit.Assert;

public class LoginTest extends BaseTest {

    public void loginTest() {
        File file = new File("C://Users//User//Desktop//LoginPassword.txt");
        LoginData ld = new LoginData("some login", "some password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(ld);
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isImportantLabelAvaliable());
    }
}
