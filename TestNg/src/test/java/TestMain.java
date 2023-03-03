import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMain extends BeforeAndAfter {
    NextPage nextPage = new NextPage(driver);

    @Test(description = "Тест на кнопку Home")
    public void buttonHome() {
        nextPage.buttonRubberDucksClick();
        Assert.assertTrue(nextPage.successMessageIsVisible(), "Text is false");
        
        nextPage.buttonHomeClick();
        Assert.assertEquals(driver.getCurrentUrl(), "https://litecart.stqa.ru/en/");
    }

    @Test(description = "Тест на кнопку Rubber Ducks")
    public void buttonRubberDuck() {
        nextPage.buttonRubberDucksClick();
        Assert.assertTrue(nextPage.successMessageIsVisible(), "Text is false");
    }
}
