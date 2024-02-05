import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private double cardLimit;
    private double balance;
    private List<Purchase> purchases;

    public CreditCard(double cardLimit) {
        this.cardLimit = cardLimit;
        this.balance = cardLimit;
        this.purchases = new ArrayList<>();
    }

    public boolean launchPurchase(Purchase purchase) {
        if (this.balance >= purchase.getPurchaseValue()) {
            this.balance -= purchase.getPurchaseValue();
            this.purchases.add(purchase);
            return true;
        }
        return false;
    }

    public double getCardLimit() {
        return cardLimit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }
}
