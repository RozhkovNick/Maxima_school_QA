import java.util.logging.Logger;

public class MethodClass {
   private static Logger LOG = Logger.getLogger(String.valueOf(MethodClass.class));
    public MethodClass() {
    }

    public static MethodClass buildMethod() {
        LOG.info("Создаем экземпляр класса");
        return new MethodClass();
    }

    public MethodClass addProduct(String a) {
        LOG.info("Добавляем в корзину");
        System.out.println("Добавлено в корзину: " + a);
        return this;
    }

    public MethodClass deleteProduct(String a) {
        LOG.info("Удаляем из корзиины");
        System.out.println("Удалено из корзины: " + a);
        return this;
    }
}
