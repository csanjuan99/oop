import models.PayrollCard;
import models.TeenCard;
import models.VisaCard;
import models.Wallet;

public class Main {
    public static void main(String[] args) {

        Wallet b1 = new Wallet("Enero");
        b1.addCard(new TeenCard("000-1112-111", 10000));
        b1.addCard(new PayrollCard("000-1112-222", 100000));
        b1.addCard(new VisaCard("000-1112-333", 80000));
        b1.addCard(new TeenCard("000-1112-444", 12000));
        b1.getCardList();
        Wallet b2 = new Wallet("Febrero");
        b2.addCard(new TeenCard("000-2345-111", 25000));
        b2.addCard(new PayrollCard("000-2345-222", 90000));
        b2.addCard(new VisaCard("000-2345-333", 75000));
        b2.addCard(new TeenCard("000-2345-444", 18000));
        b2.getCardList();
    }
}
