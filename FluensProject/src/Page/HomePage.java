package Page;

public class HomePage {
    public HomePage() {
    }

    public HomePage openMenu() {
        System.out.println("Открыть меню");
        return this;
    }

    public HomePage selectShop(ShopMainPage searchShopDescription) {
        System.out.println("Выбрать магазин");
        return this;
    }

    public ShopMainPage enterShop() {
        System.out.println("Кликнуть на магазин");
        return new ShopMainPage();
    }
}
