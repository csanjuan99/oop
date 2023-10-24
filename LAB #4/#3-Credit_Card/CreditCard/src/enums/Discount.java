package enums;

public enum Discount {

    BASIC(0.08),
    PLATINUM(0.12),
    DIAMOND(0.15);

    private final double discount;

    private Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount(double amount) {
        return amount * this.discount;
    }
}
