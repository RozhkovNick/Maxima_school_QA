import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(" https://the-internet.herokuapp.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        allLinks.get(10).click();
    }
}

