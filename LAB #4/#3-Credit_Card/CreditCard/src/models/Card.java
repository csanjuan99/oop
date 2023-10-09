package models;

public abstract class Card {

    public String accountNumber;
    private final double openAmount;

    public Card(String accountNumber, double openAmount) {
        this.accountNumber = accountNumber;
        this.openAmount = openAmount;
    }

    public abstract double getHandlingFee();

    public String toString() {
        return "El valor de cuota  de : " + accountNumber + " es: $" + getHandlingFee() + " tipo de tarjeta " + this.getClass().getName();
    }

    public double getOpenAmount() {
        return openAmount;
    }
}
