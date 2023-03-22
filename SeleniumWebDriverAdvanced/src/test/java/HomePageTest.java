import org.testng.annotations.Test;

public class HomePageTest extends HomePageBeforeAndAfter {
    HomePagePageObject joinHomePageMethod = new HomePagePageObject(driver);

    @Test(description = "Клик на кнопку Subcategory")
    public void main() {
        joinHomePageMethod.clickButtonSubcategory();
    }
}

