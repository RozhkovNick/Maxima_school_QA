import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainTest extends JoinAndExitPage {
    MethodsClass methodsClass = new MethodsClass(driver);

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
        methodsClass.joinSadowRoot();
        methodsClass.joinShadowRoot2();
        methodsClass.switchInitialWindow();
        methodsClass.joinShadowRoot3();
        methodsClass.actionMethod();
    }
}
