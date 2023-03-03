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
    private List<String> expectedList = new ArrayList<>();
    private List<String> actualList = new ArrayList<>();

    public SortedPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonName() {
        driver.findElement(nameButton).click();
    }

    public List<String> checkSortingNameExpected() {
        expectedList.add("Green Duck");
        expectedList.add("Yellow Duck");
        return expectedList;
    }

    public List<String> checkSortingNameActual() {
        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
        return actualList;
    }

    public void clickButtonPrice() {
        driver.findElement(priceButton).click();
    }

    public List<String> checkSortingPriceExpected() {
        expectedList.add("$20");
        expectedList.add("$18");
        return expectedList;
    }

    public List<String> checkSortingPriceActual() {
        List<WebElement> elements = driver.findElements(By.cssSelector(".price-wrapper :last-child"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
        return actualList;
    }

    public void clickButtonPopularity() {
        driver.findElement(popularityButton).click();
    }

    public List<String> checkSortingPopularityExpected() {
        expectedList.add("Green Duck");
        expectedList.add("Yellow Duck");
        return expectedList;
    }

    public List<String> checkSortingPopularityActual() {
        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
        return actualList;
    }

    public void clickButtonDate() {
        driver.findElement(dateButton).click();
    }

    public void checkSortingDate() {
        expectedList.add("Yellow Duck");
        expectedList.add("Green Duck");

        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
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