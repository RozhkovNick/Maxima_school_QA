import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class JoinHomePageMethod {
    WebDriver driver;
    private By buttonRubberDucks = By.cssSelector("#site-menu .category-1");
    private By buttonSubcategory = By.cssSelector(".category-2");

    public JoinHomePageMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonSubcategory() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(buttonRubberDucks))
                .click(driver.findElement(buttonSubcategory))
                .build()
                .perform();
    }
}
