package models;

public class ShoppingHotSale extends Shopping {

    private final HotSaleDiscount hotSaleDiscount;

    public ShoppingHotSale(HotSaleDiscount hotSaleDiscount) {
        super();
        this.hotSaleDiscount = hotSaleDiscount;
    }

    @Override
    public Shopping createDiscount() {
        return this;
    }

    @Override
    public HotSaleDiscount getDiscount() {
        return hotSaleDiscount;
    }

}
