import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // First thing is to think about the Classes, then its attributes and methods
        // Then we need to create an instance of the class with essential constructors
        // Define which getter and setter to use

        Scanner scanInput = new Scanner(System.in);
        System.out.println("Type the card limit: ");
        double cardLimit = scanInput.nextDouble();
        CreditCard creditCard = new CreditCard(cardLimit);

        int quit = 1;
        while(quit != 0) {
            System.out.println("Type the purchase description: ");
            String description = scanInput.next();

            System.out.println("Type the purchase value: ");
            double purchaseValue = scanInput.nextDouble();

            Purchase purchase = new Purchase(description, purchaseValue);
            boolean purchaseMade = creditCard.launchPurchase(purchase);

            if (purchaseMade) {
                System.out.println("Purchase made!");
                System.out.println("Type 0 to exit or 1 to continue: ");
                quit = scanInput.nextInt();
            } else {
                System.out.println("Insufficient balance!");
                quit = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("PURCHASES:\n");

        // Sorting the list
        // Implement comparable at Purchase class
        // override compareTo at Purchase class

        Collections.sort(creditCard.getPurchases());

        for (Purchase c : creditCard.getPurchases()) {
            System.out.println(c.getPurchaseDescription() + " - " +c.getPurchaseValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nCurrent balance: " +creditCard.getBalance());





    }
}
