package org.lessons.java.shop;

//decimali per valiute e arrotondamenti (per operazioni si usano metodi e non /, *, +, -)
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // creo un nuovo oggetto prodotto

        // nuovo prodotto
        Prodotto nuovoProdotto = new Prodotto("iphone 16 pro max", "iphone di ultima generazione", new BigDecimal(999),
                new BigDecimal(0.22));

        // metodo per prezzo base
        System.out.println(nuovoProdotto.getPrezzoBase());

        // metodo per prezzo comprensivo di iva
        System.out.println(nuovoProdotto.getPrezzoIvato());

        // metodo per nome esteso concatenando codice e nome
        System.out.println(nuovoProdotto.getNomeEsteso());

    }
}
