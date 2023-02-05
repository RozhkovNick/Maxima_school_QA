import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert {
    @Test
    public void main() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsAlert()']"));
        alertButton.click();
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertEquals(driver.findElement(By.cssSelector("#result"))
                .getText(), "You successfully clicked an alert");
        driver.quit();
    }

    @Test
    public void confirmYes() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertConfirm = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));
        alertConfirm.click();
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertEquals(driver.findElement(By.cssSelector("#result"))
                .getText(), "You clicked: Ok");
        driver.quit();
    }

    @Test
    public void confirmNo() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertConfirms = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));
        alertConfirms.click();
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.dismiss();

        Assert.assertEquals(driver.findElement(By.cssSelector("#result"))
                .getText(), "You clicked: Cancel");
        driver.quit();
    }

    @Test
    public void prompt() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertPrompt = driver.findElement(By.cssSelector("[onclick='jsPrompt()']"));
        alertPrompt.click();
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();

        Assert.assertEquals(driver.findElement(By.cssSelector("#result"))
                .getText(), "You entered: Hello");
        driver.quit();
    }
}
