package HW_Sem3;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(int productId) {
        super("Продукт с ID " + productId + " не найден.");
    }
}