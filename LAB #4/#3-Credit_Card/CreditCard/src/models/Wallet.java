package models;

import java.util.List;

public class Wallet implements WalletPattern {

    public String month;
    private final List<Card> cardList = new java.util.ArrayList<>();

    public Wallet(String month) {
        this.month = month;
    }

    public void getCardList() {
        System.out.println("***BALENCE DE " + month + "***");
        for (Card card : cardList) {
            System.out.println(card.toString());
        }
    }

    public void addCard(Card card) {
        this.cardList.add(card);
    }

}
