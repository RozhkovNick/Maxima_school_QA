import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SortedPageTest extends SortedPageBeforeAndAfter {
    SortedPageObject sortedMethods = new SortedPageObject(driver);

    @Test(description = "Тест сортировки по имени")
    public void sortingByName() {
        sortedMethods.clickButtonName();
        List<String> expected = sortedMethods.checkSortingNameExpected();
        List<String> actual = sortedMethods.checkSortingNameActual();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Тест сортировки по цене")
    public void sortingByPrice() {
        sortedMethods.clickButtonPrice();
        List<String> expected = sortedMethods.checkSortingPriceExpected();
        List<String> actual = sortedMethods.checkSortingPriceActual();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Тест сортировки по популярности")
    public void sortingByPopularity() {
        sortedMethods.clickButtonPopularity();
        List<String> expected = sortedMethods.checkSortingPopularityExpected();
        List<String> actual = sortedMethods.checkSortingPopularityActual();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Тест сортировки по дате")
    public void sortingByDate() {
        sortedMethods.clickButtonDate();
        sortedMethods.checkSortingDate();

    }

    @Test(description = "Тест на проверку лейбла “New”")
    public void findNew() {
        String expected = "NEW";
        Assert.assertEquals(sortedMethods.findStikerNew(), expected);
    }

    @Test(description = "Тест на проверку лейбла “Sale”")
    public void findSale() {
        String expected = "SALE";
        Assert.assertEquals(sortedMethods.findStikerSale(), expected);
    }
}
