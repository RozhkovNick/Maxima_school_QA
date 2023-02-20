import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

public class JoinAndExitPage {
    WebDriver driver = new ChromeDriver();
    public WebDriverWait wait;

    @BeforeTest
    public void initTest() {
        driver.manage().window().setSize(new Dimension(1980, 1020));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}
