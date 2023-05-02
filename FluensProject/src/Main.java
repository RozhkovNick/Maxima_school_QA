import Page.HomePage;
import Page.LoginPage;
import Page.SearchEntity;
import Page.ShopMainPage;

import java.util.logging.Logger;

public class Main {
    private static Logger LOG = Logger.getLogger(String.valueOf(MethodClass.class));

    public static void main(String[] args) {
        LOG.info("==============Build================= \n");
        MethodClass object = new MethodClass();
        object.addProduct("Хлеб")
                .addProduct("Молоко")
                .addProduct("Чай")
                .deleteProduct("чай");

        MethodClass object1 = MethodClass.buildMethod()
                .addProduct("Хлеб")
                .addProduct("Молоко")
                .addProduct("Чай")
                .deleteProduct("чай");

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        ShopMainPage shopMainPage = new ShopMainPage();
        SearchEntity entity = new SearchEntity();

        loginPage.login();
        homePage.openMenu();
        homePage.selectShop(shopMainPage);
        homePage.enterShop();

        shopMainPage.search(entity);
    }
}