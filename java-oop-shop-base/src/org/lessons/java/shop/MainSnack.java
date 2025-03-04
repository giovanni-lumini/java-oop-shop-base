package org.lessons.java.shop;

public class MainSnack {
    public static void main(String[] args) {
        // studente
        Studente giovanni = new Studente("Giovanni", "Rossi", 20);
        // con il metodo con il return, si possono salvare i dati in una variabile
        // con il void non è possibile
        String datiStudente = giovanni.datiStudente();
        System.out.println(datiStudente);
    }
}
