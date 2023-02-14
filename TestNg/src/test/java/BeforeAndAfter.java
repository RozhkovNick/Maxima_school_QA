import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BeforeAndAfter {
    WebDriver driver = new ChromeDriver();

    @BeforeTest(description = "Вход на сайт")
    public void beforeTest() {
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().setSize(new Dimension(1980, 1020));
    }

    @AfterTest(description = "Закрываем браузер")
    public void afterTest() {
        driver.quit();
    }
}
