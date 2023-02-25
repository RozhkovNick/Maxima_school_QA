import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AlertPageObject {
    private WebDriver driver;
    private By alertButton = By.cssSelector("[onclick='jsAlert()']");
    private By result = By.cssSelector("#result");
    private By confirmYesClick = By.cssSelector("[onclick='jsConfirm()']");
    private By promptClick = By.cssSelector("[onclick='jsPrompt()']");

    public AlertPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlert() {
        driver.findElement(alertButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String checkResultClickAlert() {
        String message = driver.findElement(result).getText();
        return message;
    }

    public void confirmYesMethod() {
        driver.findElement(confirmYesClick).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void confirmNoMethod() {
        driver.findElement(confirmYesClick).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void promptMethod(String а) {
        driver.findElement(promptClick).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(а);
        alert.accept();
    }
}
