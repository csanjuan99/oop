package models;

public class ShoppingPremiumSale extends Shopping {

    private final PremiumSaleDiscount premiumSaleDiscount;

    public ShoppingPremiumSale(PremiumSaleDiscount premiumSaleDiscount) {
        super();
        this.premiumSaleDiscount = premiumSaleDiscount;
    }

    @Override
    public Shopping createDiscount() {
        return this;
    }

    @Override
    public PremiumSaleDiscount getDiscount() {
        return premiumSaleDiscount;
    }

}
