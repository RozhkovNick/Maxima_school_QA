import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestMain {
    @Test
    public void clickElementTest() {
        WebDriver driver = new ChromeDriver();
        PageObject pageObject = new PageObject(driver);
        
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get(" https://the-internet.herokuapp.com");

        pageObject.clickListWebElement(10);

        driver.quit();
    }

}
