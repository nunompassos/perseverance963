package tech.ada.livecoding.contas;

import java.math.BigDecimal;

public interface ContaDepositavel {
    BigDecimal depositar(BigDecimal montante);
}
