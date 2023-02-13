import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {
    private By listWebElement = By.tagName("a");

    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void setListWebElement(int index) {
        driver.findElements(listWebElement).get(index).click();
    }
}
