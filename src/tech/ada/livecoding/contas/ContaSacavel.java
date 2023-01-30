package tech.ada.livecoding.contas;

import java.math.BigDecimal;

public interface ContaSacavel {

    /**
     * Método para remover montante do saldo da conta.
     * @param montante valor a remover do saldo.
     * @return saldo.
     */
    BigDecimal sacar(BigDecimal montante);
}
