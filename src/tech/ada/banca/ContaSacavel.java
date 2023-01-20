package tech.ada.banca;

import java.math.BigDecimal;

public abstract class ContaSacavel extends Conta {

    public BigDecimal sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            return saldo;
        } else {
            throw new ArithmeticException();
        }
    }

}
