package esercizio4;

import java.util.Scanner;

public class Esercizio4 {

    // NUMERO INTERO CON CONTO ALLA ROVESCIA A 0
    public void esegui() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        for (int i = numero; i >= 0; i--) { // CICLO FOR
            System.out.println(i);
        }
    }
}