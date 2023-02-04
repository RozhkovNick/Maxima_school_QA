import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Main {
    @Test
    public void main(){
      WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get(" https://the-internet.herokuapp.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        allLinks.get(10).click();
        driver.quit();
    }
}
