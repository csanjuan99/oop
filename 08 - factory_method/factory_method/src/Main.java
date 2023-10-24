import models.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Buying...");
        Shopping shopping = new ShoppingHotSale(
                new HotSaleDiscount()
        );
        shopping.createDiscount();
        System.out.println("Discount: " + shopping.getDiscount());

    }
}
