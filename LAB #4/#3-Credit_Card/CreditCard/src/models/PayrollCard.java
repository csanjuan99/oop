package models;

import enums.Discount;

public class PayrollCard extends Card {

    public PayrollCard(String accountNumber, double openAmount) {
        super(accountNumber, openAmount);
    }

    public double getHandlingFee() {
        return 20000 - Discount.PLATINUM.getDiscount(this.getOpenAmount());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
