package org.lessons.java.shop;

//random
import java.util.Random;

public class Prodotto {
    // ISTANZE
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public int iva;

    // METODI
    // costruttore
    public Prodotto(String nome, String descrizione, float prezzo, int iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodo per codice random
    public void codiceRandom() {
        Random random = new Random();
        int max = 101;
        this.codice = random.nextInt(max);
    }

    // metodo per prezzo base
    public void prezzoBase(float prezzo) {
        this.prezzo = prezzo;
    }

    // metodo per prezzo comprensivo di iva
    public void prezzoIvato(int prezzo, int iva) {
        this.prezzo = prezzo + (prezzo * iva / 100);
    }

    // metodo per nome esteso concatenando codice e nome
    public void codicePiuNome(int codice, String nome) {
        this.nome = codice + "-" + nome;
    }
}
