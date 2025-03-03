package org.lessons.java.shop;

//decimali per valiute e arrotondamenti (per operazioni si usano metodi e non /, *, +, -)
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // creo un nuovo oggetto prodotto

        // 1-nuovo prodotto (costruttore 1)
        Prodotto iphone = new Prodotto("iphone 16 pro max", "iphone di ultima generazione",
                BigDecimal.valueOf(999), BigDecimal.valueOf(0.22));

        // 2-nuovo prodotto (costruttore 2)
        Prodotto macbook = new Prodotto("MacBook Air", "MacBook di ultima generazione");

        // 1-iphone
        // metodo per prezzo base
        System.out.println(iphone.getPrezzoBase());

        // cambio valore iva con il setter
        iphone.setIva(BigDecimal.valueOf(0.10));

        // metodo per prezzo comprensivo di iva
        System.out.println(iphone.getPrezzoIvato());

        // metodo per nome esteso concatenando codice e nome
        System.out.println(iphone.getNomeEsteso());

        // 2-macbook
        // cambio valore descrizione con il setter
        System.out.println(macbook.getNome());

        macbook.setDescrizione("MacBook Air 13 inch");
        System.out.println(macbook.getDescrizione());

    }
}
