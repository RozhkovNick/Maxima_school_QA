import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethod {
    WebDriver driver;
    private By element = By.cssSelector("#draggable.ui-widget-content");
    private By element1 = By.cssSelector("#droppable.ui-widget-header");

    public ActionsMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void moveAndElements() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element))
                .clickAndHold()
                .moveToElement(driver.findElement(element1))
                .build()
                .perform();
    }
}
