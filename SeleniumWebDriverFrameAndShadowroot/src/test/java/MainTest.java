import org.testng.annotations.Test;

public class MainTest extends BeforeAndAfter {
    PageObject methodsClass = new PageObject(driver);

    @Test(description = "Тест на проверку фрэймов.")
    public void frame() {
        methodsClass.frameMethod();
    }

    @Test(description = "Тест на проверку переключения окон браузера.")
    public void window() {
        methodsClass.windowSwitchMethod();
    }

    @Test(description = "Проверка shadowRoot.")
    public void shadowRoot() {
        methodsClass.joinDrawingApp();
        methodsClass.joinWelcomeDialog();
        methodsClass.clickStartedButton();
        methodsClass.switchInitialWindow();
        methodsClass.joinDrawingCanvas();
        methodsClass.actionMethod();
    }
}
