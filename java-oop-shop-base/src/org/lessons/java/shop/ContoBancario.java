package org.lessons.java.shop;

//decimali per valute e arrotondamenti (per operazioni si usano metodi e non /, *, +, -)
import java.math.BigDecimal;
/* import java.math.RoundingMode; */

public class ContoBancario {
    // istanze
    public String numeroConto;
    public BigDecimal saldo;

    // costruttore
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        // inizializzo il saldo a 0
        this.saldo = BigDecimal.ZERO;
    }

    // metodi
    // deposito
    public void deposito(BigDecimal deposito) {
        this.saldo = saldo.add(deposito);
        System.out.println("Deposito effettuato");
    }

    // prelievo
    public void prelievo(BigDecimal prelievo) {
        // diamo valore alla variabile prelievo tramite input
        this.saldo = saldo.subtract(prelievo);
        System.out.println("Prelievo effettuato");
    }

    // saldo corrente
    public String saldoCorrente() {
        return "Il tuo saldo corrente è: " + saldo;
    }
}
