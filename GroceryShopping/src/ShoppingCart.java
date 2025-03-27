import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Benvenuto nel negozio! Digita 'Exit' per uscire.");
        
        // Scanner per l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        
        // Array degli articoli e prezzi
        String[] items = {"Apple", "Banana", "Bread", "Milk", "Eggs", "Cheese", "Chicken", "Rice", "Pasta", "Tomato"};
        float[] prices = {0.50f, 0.30f, 2.00f, 1.50f, 2.50f, 3.00f, 5.00f, 1.00f, 1.20f, 0.80f};
        
        // Variabile per il totale del conto
        float totalBill = 0.0f;

        while (true) {
            System.out.println("Cosa vuoi acquistare? Ci sono: Apple, Banana, Bread, Milk, Eggs, Cheese, Chicken, Rice, Pasta e Tomato (Digita 'Complete' per terminare o 'Exit' per uscire)");
            String inputItem = scanner.nextLine();

            if (inputItem.equalsIgnoreCase("Exit")) {
                System.out.println("Grazie per aver visitato il negozio!");
                break;
            }

            if (inputItem.equalsIgnoreCase("Complete")) {
                System.out.println("Il totale del tuo conto è: $" + totalBill);
                break;
            }

            // Ricerca dell'elemento nell'array
            int itemIndex = -1;
            for (int i = 0; i < items.length; i++) {
                if (items[i].equalsIgnoreCase(inputItem)) {
                    itemIndex = i;
                    break;
                }
            }

            // Se l'elemento non è trovato
            if (itemIndex == -1) {
                System.out.println("Articolo non trovato! Riprova.");
                continue;
            }

            // Chiedere la quantità
            System.out.println("Quanti " + items[itemIndex] + " vuoi acquistare?");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Per evitare problemi con il buffer

            // Calcolare il prezzo totale dell'articolo
            float itemCost = prices[itemIndex] * quantity;
            totalBill += itemCost;

            System.out.println(quantity + " x " + items[itemIndex] + " aggiunti al carrello. Totale attuale: $" + totalBill);
        }

        scanner.close();
    }
}

