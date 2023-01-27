package tech.ada.livecoding.contas;

import java.math.BigDecimal;

public abstract class Conta {

    protected BigDecimal getSaldo() {
        return saldo;
    }

    private BigDecimal saldo = BigDecimal.ZERO;

    protected final void adicionarSaldo(BigDecimal montante) {
        validarMontante(montante);
        saldo = saldo.add(montante);
    }

    protected void removerSaldo(BigDecimal montante) {
        validarMontante(montante);
        validarMontanteComSaldo(montante);
        saldo = saldo.subtract(montante);
    }

    private void validarMontante(BigDecimal montante) {
        if (BigDecimal.ZERO.compareTo(montante) >= 0) {
            throw new IllegalArgumentException("Montante tem de ser positivo");
        }
    }

    private void validarMontanteComSaldo(BigDecimal montante) {
        if (saldo.compareTo(montante) < 0) {
            throw new IllegalArgumentException("Montante tem de ser menor que saldo!");
        }
    }

    public abstract BigDecimal sacar(BigDecimal saque);
    public abstract BigDecimal depositar(BigDecimal deposito);
    public abstract BigDecimal transferir(BigDecimal montante, Conta destino);
}
