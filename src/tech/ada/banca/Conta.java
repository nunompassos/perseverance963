package tech.ada.banca;

import java.math.BigDecimal;

public abstract class Conta {

    BigDecimal saldo = BigDecimal.ZERO;

    public BigDecimal depositar(BigDecimal valor){
        saldo = saldo.add(valor);
        return saldo;
    }

    /*public BigDecimal sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            return saldo;
        } else {
            throw new ArithmeticException();
        }
    }*/
}
