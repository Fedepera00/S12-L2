package esercizio2;

import java.util.Scanner; // LO SCANNER CI SERVE PER LEGGERE L'INPUT

public class Esercizio2 {

    // SWITCH NUMERI 1 - 3
    public void stampaNumero(int numero) {
        switch (numero) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Due");
            case 3 -> System.out.println("Tre");
            default -> System.out.println("Errore: il numero non è compreso tra 0 e 3");
        }
    }

    public void esegui() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero tra 0 e 3: ");
        int numero = scanner.nextInt(); // Legge l'input
        stampaNumero(numero);
    }
}