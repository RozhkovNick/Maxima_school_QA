import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SortedMethods {
    private By nameButton = By.cssSelector(".button[href$=name]");
    private By priceButton = By.cssSelector(".button.active");
    private By popularityButton = By.cssSelector(".button[href$=popularity]");
    private By dateButton = By.cssSelector(".button[href$=date]");
    private By stikerNew = By.cssSelector(".sticker.new");
    private By stikerSale = By.cssSelector(".sticker.sale");

    private WebDriver driver;

    public SortedMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonName() {
        driver.findElement(nameButton).click();
    }

    public void checkSortingName() {
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Green Duck");
        expectedList.add("Yellow Duck");

        List<String> actualList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));

        for (WebElement e : elements) {
            actualList.add(e.getText());
        }

        Assert.assertEquals(actualList, expectedList);
    }

    public void clickButtonPrice() {
        driver.findElement(priceButton).click();
    }

    public void checkSortingPrice() {
        List<String> expectedList = new ArrayList<>();
        expectedList.add("$18");
        expectedList.add("$20");

        List<String> actualList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(".price-wrapper :last-child"));

        for (WebElement e : elements) {
            actualList.add(e.getText());
        }

        Assert.assertEquals(actualList, expectedList);
    }

    public void clickButtonPopularity() {
        driver.findElement(popularityButton).click();
    }

    public void checkSortingPopularity() {
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Yellow Duck");
        expectedList.add("Green Duck");

        List<String> actualList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));

        for (WebElement e : elements) {
            actualList.add(e.getText());
        }

        Assert.assertEquals(actualList, expectedList);
    }

    public void clickButtonDate() {
        driver.findElement(dateButton).click();
    }

    public void checkSortingDate(String a, String b) {
        List<String> expectedList = new ArrayList<>();
        expectedList.add(a);
        expectedList.add(b);

        List<String> actualList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));

        for (WebElement e : elements) {
            actualList.add(e.getText());
        }

        Assert.assertEquals(actualList, expectedList);
    }

    public void findStikerNew(String expected) {
        Assert.assertEquals(driver.findElement(stikerNew).getText(), expected);
    }

    public void findStikerSale(String expected) {
        Assert.assertEquals(driver.findElement(stikerSale).getText(), expected);
    }
}