import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Main{
    @Test
    public void main() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/");
        WebElement linkToCheckboxes = driver.findElement(By.cssSelector(".fa.fa-home"));
        linkToCheckboxes.click();
        WebElement linkToCheckboxes1 = driver.findElement(By.cssSelector("#site-menu .category-1"));
        linkToCheckboxes1.click();
        WebElement element = driver.findElement(By.cssSelector(".link[href=\"https://litecart.stqa.ru/en/rubber-ducks-c-1/blue-duck-p-4\"]"));
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }

}
