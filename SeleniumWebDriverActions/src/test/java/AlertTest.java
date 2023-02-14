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
        AlertMethods alertMethods = new AlertMethods(driver);
        alertMethods.confirmYesMethod();
        alertMethods.checkResultConfirmYesMethod("You clicked: Ok");
    }

    @Test(description = "Закрытие алерта по кнопке НЕТ")
    public void confirmNo() {
        alertMethods.confirmNoMethod();
        alertMethods.checkResultConfirmNoMethod("You clicked: Cancel");
    }

    @Test(description = "Ввод текста и закрытие алерта")
    public void prompt() {
        alertMethods.promptMethod();
        alertMethods.checkResultPromptMethod("You entered: Hello");
    }
}
