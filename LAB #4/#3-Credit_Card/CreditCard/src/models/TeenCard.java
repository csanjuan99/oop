package models;

import enums.Discount;

public class TeenCard extends Card {

    public TeenCard(String accountNumber, double openAmount) {
        super(accountNumber, openAmount);
    }


    public double getHandlingFee() {
        return 20000 - Discount.BASIC.getDiscount(this.getOpenAmount());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
