package org.lessons.java.shop;

//random
import java.util.Random;

//decimali per valiute e arrotondamenti (per operazioni si usano metodi e non /, *, +, -)
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    // ISTANZE
    public int codice;
    public String nome;
    public String descrizione;
    // BigDecimal va bene per le valute
    public BigDecimal prezzo;
    public BigDecimal iva;

    // METODI
    // costruttore
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        // metodo per codice random
        Random random = new Random();
        this.codice = random.nextInt(99999);

        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodo per prezzo base
    // i metodi get consentono di recuperare una variabile d'istanza (this.prezzo)
    public BigDecimal getPrezzoBase() {
        return this.prezzo;
    }

    // metodo per prezzo comprensivo di iva
    public BigDecimal getPrezzoIvato() {
        if (prezzo != null && iva != null) {
            // per i BigDecimal per le operazioni si usa: add, multiply ecc..
            // setScale permette di definire il numero di cifre decimali e se arrotondare
            // verso l'alto o il basso
            return prezzo.add(prezzo.multiply(iva).setScale(2, RoundingMode.DOWN));
        }
        return null;
    }

    // metodo per nome esteso concatenando codice e nome
    public String getNomeEsteso() {
        if (nome != null) {
            return codice + "-" + nome;
        }
        return null;
    }
}
