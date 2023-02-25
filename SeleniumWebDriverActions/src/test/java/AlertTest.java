import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends AlertJoinAndExit {
    AlertMethods alertMethods = new AlertMethods(driver);

    @Test(description = "Закрытие по кнопке алерта")
    public void alertClick() {
        alertMethods.clickAlert();
        alertMethods.checkResultClickAlert("You successfully clicked an alert");
    }

    @Test(description = "Закрытие алерта по кнопке ДА")
    public void confirmYes() {
        alertMethods.confirmYesMethod();
        alertMethods.checkResultConfirmYesMethod("You clicked: Ok");
    }

    @Test(description = "Закрытие алерта по кнопке НЕТ")
    public void confirmNo() {
        alertMethods.confirmNoMethod();
        String expected = "You clicked: Cancel";
        Assert.assertEquals(alertMethods.checkResultConfirmNoMethod(), expected);
    }

    @Test(description = "Ввод текста и закрытие алерта")
    public void prompt() {
        alertMethods.promptMethod("Hello");
        String expected = "You entered: Hello";
        Assert.assertEquals(alertMethods.checkResultPromptMethod(), expected);
    }
}
