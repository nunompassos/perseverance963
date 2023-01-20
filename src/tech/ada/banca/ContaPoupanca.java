package tech.ada.banca;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaSacavel {

    public void pagarJuros() {
        saldo = saldo.multiply(new BigDecimal("1.01"));
    }
}
