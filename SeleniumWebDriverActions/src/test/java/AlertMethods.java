import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AlertMethods {
    private WebDriver driver;
    private By alertButton = By.cssSelector("[onclick='jsAlert()']");
    private By result = By.cssSelector("#result");
    private By confirmYesClick = By.cssSelector("[onclick='jsConfirm()']");
    private By promptClick = By.cssSelector("[onclick='jsPrompt()']");


    public AlertMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlert() {
        driver.findElement(alertButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void checkResultClickAlert(String expectedResult) {
        Assert.assertEquals(driver.findElement(result).getText(), expectedResult);
    }

    public void confirmYesMethod() {
        driver.findElement(confirmYesClick).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void checkResultConfirmYesMethod(String expectedResult) {
        Assert.assertEquals(driver.findElement(result).getText(), expectedResult);
    }

    public void confirmNoMethod() {
        driver.findElement(confirmYesClick).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void checkResultConfirmNoMethod(String expectedResult) {
        Assert.assertEquals(driver.findElement(result).getText(), expectedResult);
    }

    public void promptMethod() {
        driver.findElement(promptClick).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();
    }

    public void checkResultPromptMethod(String expectedResult) {
        Assert.assertEquals(driver.findElement(result).getText(), expectedResult);
    }
}
