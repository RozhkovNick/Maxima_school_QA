import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMain extends BeforeAndAfter {

    @Test(priority = 1, description = "Test button Home")
    public void homeClick() {

        NextPage nextPage = new NextPage(driver);
        nextPage.buttonHomeClick();
    }

    @Test(priority = 2, description = "Test button Rubber Ducks")
    public void rubberDucks() {
        NextPage nextPage = new NextPage(driver);
        nextPage.buttonRubberDucksClick();

        Assert.assertTrue(nextPage.successMessageIsVisible(), "Text is false");
    }
}