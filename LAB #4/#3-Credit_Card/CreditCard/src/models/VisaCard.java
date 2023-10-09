package models;

import enums.Discount;

public class VisaCard extends Card {

    public VisaCard(String accountNumber, double openAmount) {
        super(accountNumber, openAmount);
    }


    public double getHandlingFee() {
        return 20000 - Discount.DIAMOND.getDiscount(this.getOpenAmount());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
