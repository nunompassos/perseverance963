package tech.ada.banca;

import java.math.BigDecimal;

public class ServicoSacarAppBancaria {

    private ContaSacavel c;

    public void depositar(BigDecimal valor) {
        c = new ContaPoupanca();
        c.depositar(valor);
        c.sacar(valor);
    }
}
