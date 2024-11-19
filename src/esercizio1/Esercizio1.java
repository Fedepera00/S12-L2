package esercizio1;

public class Esercizio1 {

    // CAPISCO SE E' PARI O DISPARI
    public boolean stringaPariDispari(String input) {
        return input.length() % 2 == 0; //TRUE ALTRIMENTI FALSE
    }

    // CAPISCO SE UN ANNO E' BISESTILE
    public boolean annoBisestile(int anno) {

        return (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0));
    }
}