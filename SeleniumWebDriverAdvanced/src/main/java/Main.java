import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;
public class Main {

    @Test
    public void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/");
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.cssSelector("#site-menu .category-1"));
        WebElement element2 = driver.findElement(By.cssSelector(".category-2"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .click(element2)
                .build()
                .perform();
        driver.quit();
    }

    @Test
    public void sortingByName() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/ ");
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.cssSelector("[href$=name]"));
        element.click();

        List<String> actualList = new ArrayList<>();
        actualList.add("Green Duck");
        actualList.add("Yellow Duck");

        List<String> expectedList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));

        for (WebElement e : elements) {
            expectedList.add(e.getText());
        }

        Assert.assertEquals(expectedList, actualList);
        driver.quit();
    }

    @Test
    public void sortingByPrice() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/ ");
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.cssSelector(".button.active"));
        element.click();

        List<String> actualList = new ArrayList<>();
        actualList.add("$18");
        actualList.add("$20");

        List<String> expectedList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(".price-wrapper :last-child"));

        for (WebElement e : elements) {
            expectedList.add(e.getText());
        }

        Assert.assertEquals(expectedList, actualList);
        driver.quit();
    }

    @Test
    public void sortingByDate() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/ ");
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.cssSelector("[href$=popularity]"));
        element.click();

        List<String> actualList = new ArrayList<>();
        actualList.add("Green Duck");
        actualList.add("Yellow Duck");

        List<String> expectedList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));

        for (WebElement e : elements) {
            expectedList.add(e.getText());
        }

        Assert.assertEquals(expectedList, actualList);
        driver.quit();
    }

    @Test
    public void sortingByPopularity() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/ ");
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.cssSelector("[href$=date]"));
        element.click();

        List<String> actualList = new ArrayList<>();
        actualList.add("Yellow Duck");
        actualList.add("Green Duck");

        List<String> expectedList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));

        for (WebElement e : elements) {
            expectedList.add(e.getText());
        }

        Assert.assertEquals(expectedList, actualList);
        driver.quit();
    }
}


