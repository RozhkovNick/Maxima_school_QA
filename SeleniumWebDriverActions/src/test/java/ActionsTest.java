import org.testng.annotations.Test;

public class ActionsTest extends ActionsJoinAndExit {
    @Test
    public void main() {
        ActionsMethod actionsMethod = new ActionsMethod(driver);
        actionsMethod.moveAndElements();
    }
}
