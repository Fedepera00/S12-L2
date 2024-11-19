import esercizio1.Esercizio1;
import esercizio2.Esercizio2;
import esercizio3.Esercizio3;
import esercizio4.Esercizio4;

import java.util.Scanner;

public class Main {

    // CREAZIONE QUANDO ESEGUIAMO IL NOSTRO PROGRAMMA
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Forza cominciamo!! Da quale esercizio vogliamo partire? (1-4):");
        int scelta = scanner.nextInt();
        scanner.nextLine();

        // USO LO SWITCH PER SCEGLIERE L'ESERCIZIO
        switch (scelta) {
            case 1 -> {
                Esercizio1 esercizio1 = new Esercizio1();
                System.out.print("Inserisci una stringa: ");
                String input = scanner.nextLine();
                System.out.println("La stringa è pari? " + esercizio1.stringaPariDispari(input)); // CHIAMATA PER VERIFICA STRINGA
                System.out.print("Inserisci un anno: ");
                int anno = scanner.nextInt();
                System.out.println("L'anno che hai inserito è bisestile? " + esercizio1.annoBisestile(anno)); // CHIAMATA PER VERIFICARE UN ANNO
            }
            case 2 -> {
                Esercizio2 esercizio2 = new Esercizio2();
                esercizio2.esegui();
            }
            case 3 -> {
                Esercizio3 esercizio3 = new Esercizio3();
                esercizio3.esegui();
            }
            case 4 -> {
                Esercizio4 esercizio4 = new Esercizio4();
                esercizio4.esegui();
            }
            default -> System.out.println("Scelta non valida");
        }
    }
}