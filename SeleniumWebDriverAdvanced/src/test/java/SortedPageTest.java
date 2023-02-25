import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SortedPageTest extends SortedPageBeforeAndAfter {
    SortedPageObject sortedMethods = new SortedPageObject(driver);



    @Test(description = "Тест сортировки по имени")
    public void sortingByName() {
        sortedMethods.clickButtonName();
        sortedMethods.checkSortingName();

        List<String> expected = sortedMethods.expectedList;
        List<String> actual = sortedMethods.actualList;
        Assert.assertEquals(actual,expected);
    }

    @Test(description = "Тест сортировки по цене")
    public void sortingByPrice() {
        sortedMethods.clickButtonPrice();
        sortedMethods.checkSortingPrice();

        List<String> expected = sortedMethods.expectedList;
        List<String> actual = sortedMethods.actualList;
        Assert.assertEquals(actual,expected);
    }

    @Test(description = "Тест сортировки по популярности")
    public void sortingByPopularity() {
        sortedMethods.clickButtonPopularity();
        sortedMethods.checkSortingPopularity();

        List<String> expected = sortedMethods.expectedList;
        List<String> actual = sortedMethods.actualList;
        Assert.assertEquals(actual,expected);
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
