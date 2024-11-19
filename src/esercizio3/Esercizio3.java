package esercizio3;

import java.util.Scanner;

public class Esercizio3 {

    // Legge stringhe e le suddivide in caratteri separati da virgola, fino a che non inseriamo ':q'.
    public void esegui() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Inserisci una stringa (altrimenti ':q' per uscire): ");
            input = scanner.nextLine();
            if (!input.equals(":q")) {
                String[] caratteri = input.split(""); // DIVIDE LA STRINGA IN CARATTERI
                System.out.println("Caratteri separati da virgola: " + String.join(",", caratteri)); // STRING.JOIN STAMPA I CARATTERI SEPARATI DA VIRGOLA
            }
        } while (!input.equals(":q")); // RIPETIAMO
    }
}