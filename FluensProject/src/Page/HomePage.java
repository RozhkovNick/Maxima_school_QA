package Page;

public class HomePage {
    public HomePage() {
    }

    public HomePage openMenu() {
        return this;
    }

    public HomePage selectShop(ShopMainPage searchShopDescription) {
        return this;
    }

    public ShopMainPage enterShop() {
        return new ShopMainPage();
    }
}
