package tech.ada.livecoding.contas;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
    @Override
    public BigDecimal sacar(BigDecimal saque) {
        removerSaldo(saque);
        return getSaldo();
    }

    @Override
    public BigDecimal depositar(BigDecimal deposito) {
        adicionarSaldo(deposito);
        return getSaldo();
    }

    @Override
    public BigDecimal transferir(BigDecimal montante, Conta destino) {
        removerSaldo(montante);
        destino.adicionarSaldo(montante);
        return getSaldo();
    }

    @Override
    public String toString() {
        return "Saldo: " + getSaldo();
    }
}
