public class MethodClass {
    public MethodClass() {
    }

    public static MethodClass buildMethod() {
        return new MethodClass();
    }

    public MethodClass addProduct(String a) {
        System.out.println("Добавлено в корзину: " + a);
        return this;
    }

    public MethodClass deleteProduct(String a) {
        System.out.println("Удалено из корзины: " + a);
        return this;
    }
}
