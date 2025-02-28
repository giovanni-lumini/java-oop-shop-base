package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // creo un nuovo oggetto prodotto

        // nuovo prodotto
        Prodotto nuovoProdotto = new Prodotto("iphone", "iphone 16 pro max", 22);

        // metodo per codice random
        nuovoProdotto.codiceRandom();
        System.out.println(nuovoProdotto.codice);

        // metodo per prezzo base
        nuovoProdotto.prezzoBase();
        System.out.println(nuovoProdotto.prezzo);

        // metodo per prezzo comprensivo di iva
        nuovoProdotto.prezzoIvato(nuovoProdotto.prezzo, nuovoProdotto.iva);
        System.out.println(nuovoProdotto.prezzo);

        // metodo per nome esteso concatenando codice e nome
        nuovoProdotto.codicePiuNome(nuovoProdotto.codice, nuovoProdotto.nome);
        System.out.println(nuovoProdotto.nome);

    }
}
