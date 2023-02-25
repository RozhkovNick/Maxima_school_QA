import org.testng.annotations.Test;

public class ActionsTest extends ActionsBeforeAndAfter {
    @Test
    public void main() {
        ActionsPageObject actionsMethod = new ActionsPageObject(driver);
        actionsMethod.moveAndElements();
    }
}
