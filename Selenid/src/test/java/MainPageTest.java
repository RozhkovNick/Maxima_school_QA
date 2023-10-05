import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;


public class MainPageTest {

    private final static String URl = "https://ru.wikipedia.org/wiki/Заглавная_страница";
    private WebDriver driver;

    @BeforeTest
    private void init(){
        WebDriverManager.chromedriver().setup();
        Selenide.open(URl);
    }

    @BeforeMethod
    private void initWebDriver(){
       driver = new ChromeDriver();
    }

    @Test
    public void testSearch(){
        SelenideElement search = $(By.name("search"));
        search.setValue("Арзамас");
        $(By.className("suggestions")).shouldBe(Condition.visible);
        search.sendKeys(Keys.ENTER);
        Assert.assertEquals(Selenide.webdriver().driver().url(),
                "https://ru.wikipedia.org/wiki/%D0%90%D1%80%D0%B7%D0%B0%D0%BC%D0%B0%D1%81");
    }

    @Test
    public void clickButtonMainPage() {
        SelenideElement mainPageButton = $(By.id("n-mainpage-description"));
        mainPageButton.click();
        Assert.assertEquals(Selenide.webdriver().driver().url(),
                "https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_" +
                        "%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
    }

    @Test
    public void clickButtonContent() {
        SelenideElement buttonContent = $(By.id("n-content"));
        buttonContent.click();
        Assert.assertEquals(Selenide.webdriver().driver().url(),
                "https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F:" +
                        "%D0%A1%D0%BE%D0%B4%D0%B5%D1%80%D0%B6%D0%B0%D0%BD%D0%B8%D0%B5");
    }

    @Test
    public void clickButtonFavorites() {
        SelenideElement buttonFavorites = $(By.id("n-featured"));
        buttonFavorites.click();
        Assert.assertEquals(Selenide.webdriver().driver().url(),
                "https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F:" +
                        "%D0%98%D0%B7%D0%B1%D1%80%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5_%D1%81%D1%82%D0%B0%D1%82%D1%8C%D0%B8");
    }

    @AfterMethod
    private void closeDrive(){
        driver.quit();
    }
}