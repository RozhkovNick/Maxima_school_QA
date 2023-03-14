import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class PageObject {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement canvas;
    private SearchContext drawingAppSR;
    private SearchContext welcomeDialogSR;
    private String initialWindow;
    private String joinSaidFrame = "https://the-internet.herokuapp.com/nested_frames";
    private String joinSaidWindowSwitch = "https://the-internet.herokuapp.com/windows";

    public PageObject(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        initialWindow = driver.getWindowHandle();
    }

    public void frameMethod() {
        driver.get(joinSaidFrame);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String leftFrameText = driver.findElement(By.tagName("body")).getText();
        Assert.assertEquals(leftFrameText, "LEFT");
    }

    public void windowSwitchMethod() {
        driver.get(joinSaidWindowSwitch);

        String initialTab = driver.getWindowHandle();
        driver.findElement(By.cssSelector("[href='/windows/new']")).click();

        String newTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTab);

        String text = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(text, "New Window");

        driver.close();
        driver.switchTo().window(initialTab);
        driver.close();
    }

    public SearchContext joinDrawingApp() {
        driver.get("https://canvas.apps.chrome/");
        WebElement drawingApp = driver.findElement(By.id("drawing-app"));
        drawingAppSR = getShadowRoot(drawingApp);
        return drawingAppSR;
    }

    public SearchContext joinWelcomeDialog() {
        WebElement welcomeDialog = drawingAppSR.findElement(By.cssSelector("welcome-dialog"));
        welcomeDialogSR = getShadowRoot(welcomeDialog);
        return welcomeDialogSR;
    }
    public void clickStartedButton(){
        WebElement getStartedButton = welcomeDialogSR.findElement(By.cssSelector("#get-started"));
        wait.until(ExpectedConditions.visibilityOf(getStartedButton));
        getStartedButton.click();
    }

    public void switchInitialWindow() {
        wait.until(driver -> driver.getWindowHandles().toArray().length > 1);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.close();
        driver.switchTo().window(initialWindow);
    }

    public SearchContext joinDrawingCanvas() {
        WebElement drawingCanvas = drawingAppSR.findElement(By.cssSelector("drawing-canvas"));
        SearchContext drawingCanvasSR = getShadowRoot(drawingCanvas);
        canvas = drawingCanvasSR.findElement(By.cssSelector("canvas"));
        wait.until(ExpectedConditions.visibilityOf(canvas));
        return canvas;
    }

    public void actionMethod() {
        Actions actions = new Actions(driver);
        actions.moveToElement(canvas).clickAndHold()
                .moveByOffset(100, 0)
                .moveByOffset(0, 100)
                .moveByOffset(-100, 0)
                .moveByOffset(0, -100)
                .release()
                .perform();
    }

    private SearchContext getShadowRoot(WebElement rootElement) {
        return (SearchContext) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot", rootElement);
    }
}
