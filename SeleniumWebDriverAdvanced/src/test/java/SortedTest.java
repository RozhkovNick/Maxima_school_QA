import org.testng.annotations.Test;

public class SortedTest extends JoinSortedPage {
    SortedMethods sortedMethods = new SortedMethods(driver);

    @Test(description = "Тест сортировки по имени")
    public void sortingByName() {
        sortedMethods.clickButtonName();

        sortedMethods.checkSortingName();
    }

    @Test(description = "Тест сортировки по цене")
    public void sortingByPrice() {
        sortedMethods.clickButtonPrice();

        sortedMethods.checkSortingPrice();
    }

    @Test(description = "Тест сортировки по популярности")
    public void sortingByPopularity() {
        sortedMethods.clickButtonPopularity();

        sortedMethods.checkSortingPopularity();
    }

    @Test(description = "Тест сортировки по дате")
    public void sortingByDate() {
        sortedMethods.clickButtonDate();

        sortedMethods.checkSortingDate("Yellow Duck", "Green Duck");
    }

    @Test(description = "Тест на проверку лейбла “New”")
    public void findNew() {
        sortedMethods.findStikerNew("NEW");
    }

    @Test(description = "Тест на проверку лейбла “Sale”")
    public void findSale() {
        sortedMethods.findStikerSale("SALE");
    }
}
