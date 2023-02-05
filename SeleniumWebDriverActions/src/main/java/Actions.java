import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actions {
    @Test
    public void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.cssSelector("#draggable.ui-widget-content"));
        WebElement element2 = driver.findElement(By.cssSelector("#droppable.ui-widget-header"));

        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
        actions.moveToElement(element)
                .clickAndHold()
                .moveToElement(element2)
                .release()
                .build()
                .perform();
        driver.quit();
    }
}
