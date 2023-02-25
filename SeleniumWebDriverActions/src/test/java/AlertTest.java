import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends AlertBeforeAndAfter {
    AlertPageObject alertMethods = new AlertPageObject(driver);

    @Test(description = "Закрытие по кнопке алерта")
    public void alertClick() {
        alertMethods.clickAlert();
        String expected =  "You successfully clicked an alert";
        Assert.assertEquals(alertMethods.checkResultClickAlert(), expected);
    }

    @Test(description = "Закрытие алерта по кнопке ДА")
    public void confirmYes() {
        alertMethods.confirmYesMethod();
        String expected =  "You clicked: Ok";
        Assert.assertEquals(alertMethods.checkResultClickAlert(),expected);
    }

    @Test(description = "Закрытие алерта по кнопке НЕТ")
    public void confirmNo() {
        alertMethods.confirmNoMethod();
        String expected = "You clicked: Cancel";
        Assert.assertEquals(alertMethods.checkResultClickAlert(), expected);
    }

    @Test(description = "Ввод текста и закрытие алерта")
    public void prompt() {
        alertMethods.promptMethod("Hello");
        String expected = "You entered: Hello";
        Assert.assertEquals(alertMethods.checkResultClickAlert(), expected);
    }
}
