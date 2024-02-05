public class Purchase implements Comparable<Purchase> {
        private String purchaseDescription;
        private double purchaseValue;

    public Purchase(String purchaseDescription, double purchaseValue) {
        this.purchaseDescription = purchaseDescription;
        this.purchaseValue = purchaseValue;
    }

    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    @Override
    public String toString() {
        return "Transaction: " +
                "transactionDescription='" + purchaseDescription + '\'' +
                ", transactionValue=" + purchaseValue;
    }

    @Override
    public int compareTo(Purchase anotherPurchase) {
        return Double.compare(this.getPurchaseValue(), anotherPurchase.getPurchaseValue());
    }
}
