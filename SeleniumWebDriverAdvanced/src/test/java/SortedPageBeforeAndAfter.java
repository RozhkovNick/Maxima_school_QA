import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SortedPageBeforeAndAfter {
    WebDriver driver = new ChromeDriver(options());

    public ChromeOptions options() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return options;
    }

    @BeforeTest
    public void join() {
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/");
    }

    @AfterTest
    public void exit() {
        driver.quit();
    }
}
