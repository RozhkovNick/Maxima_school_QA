import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestMain {
    @Test
    public void clickElementTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get(" https://the-internet.herokuapp.com");

        PageObject pageObject = new PageObject(driver);
        pageObject.setListWebElement(10);

        driver.quit();
    }

}
