import org.testng.annotations.Test;

public class JoinHomePageTest extends JoinHomePage {
    JoinHomePageMethod joinHomePageMethod = new JoinHomePageMethod(driver);

    @Test
    public void main() {
        joinHomePageMethod.clickButtonSubcategory();
    }
}

