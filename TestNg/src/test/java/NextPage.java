import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NextPage {
    private WebDriver driver;
    private By homeButton = By.cssSelector(".fa.fa-home");
    private By rubberDucksButton = By.cssSelector("#site-menu .category-1");
    private By successMessage = By.cssSelector("#box-category>.title");

    public NextPage(WebDriver driver) {
        this.driver = driver;
    }

    public void buttonHomeClick() {
        driver.findElement(homeButton).click();
    }

    public void buttonRubberDucksClick() {
        driver.findElement(rubberDucksButton).click();
    }

    public boolean successMessageIsVisible() {
        return driver.findElement(successMessage).isDisplayed();
    }
}
