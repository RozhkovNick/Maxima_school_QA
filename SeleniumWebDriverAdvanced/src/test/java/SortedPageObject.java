import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SortedPageObject {
    private By nameButton = By.cssSelector(".button[href$=name]");
    private By priceButton = By.cssSelector(".button.active");
    private By popularityButton = By.cssSelector(".button[href$=popularity]");
    private By dateButton = By.cssSelector(".button[href$=date]");
    private By stikerNew = By.cssSelector(".sticker.new");
    private By stikerSale = By.cssSelector(".sticker.sale");
    private WebDriver driver;

    public SortedPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonName() {
        driver.findElement(nameButton).click();
    }

    public List<String> checkSortingNameExpected() {
        List<String> expectedListName = new ArrayList<>();
        expectedListName.add("Green Duck");
        expectedListName.add("Yellow Duck");
        return expectedListName;
    }

    public List<String> checkSortingNameActual() {
        List<String> actualListName = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualListName.add(e.getText());
        }
        return actualListName;
    }

    public void clickButtonPrice() {
        driver.findElement(priceButton).click();
    }

    public List<String> checkSortingPriceExpected() {
        List<String> expectedListPrice = new ArrayList<>();
        expectedListPrice.add("$18");
        expectedListPrice.add("$20");
        return expectedListPrice;
    }

    public List<String> checkSortingPriceActual() {
        List<String> actualListPrice = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(".price-wrapper :last-child"));
        for (WebElement e : elements) {
            actualListPrice.add(e.getText());
        }
        return actualListPrice;
    }

    public void clickButtonPopularity() {
        driver.findElement(popularityButton).click();
    }

    public List<String> checkSortingPopularityExpected() {
        List<String> expectedListPopularity = new ArrayList<>();
        expectedListPopularity.add("Yellow Duck");
        expectedListPopularity.add("Green Duck");
        return expectedListPopularity;
    }

    public List<String> checkSortingPopularityActual() {
        List<String> actualListPopularity = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualListPopularity.add(e.getText());
        }
        return actualListPopularity;
    }

    public void clickButtonDate() {
        driver.findElement(dateButton).click();
    }

    public List<String> checkSortingDate() {
        List<String> expectedListDate = new ArrayList<>();
        expectedListDate.add("Yellow Duck");
        expectedListDate.add("Green Duck");
        return expectedListDate;
    }

    public List<String> checkSortingDateActual() {
        List<String> actualListDate = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualListDate.add(e.getText());
        }
        return actualListDate;
    }

    public String findStikerNew() {
        String actual = driver.findElement(stikerNew).getText();
        return actual;
    }

    public String findStikerSale() {
        String actual = driver.findElement(stikerSale).getText();
        return actual;
    }
}