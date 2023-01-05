public class HomePage extends BasePage {

    public HomePage() {
        System.out.println("HomePage default constructor call");
    }

    public static boolean isImportantLabelAvaliable() {
        System.out.println("HomePage isImportantLabelAvaliable call");
        return true;
    }

    private WebElement important_label = new WebElement("Important Label locator");
}
