package tech.ada.livecoding.contas;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class ContaPoupanca extends Conta {

    private Map<Integer, BigDecimal> saldoDia = new HashMap();
    @Override
    public BigDecimal sacar(BigDecimal saque) {
        removerSaldo(saque);
        return getSaldo();
    }

    @Override
    public BigDecimal depositar(BigDecimal deposito) {
        adicionarSaldo(deposito);
        atualizarSaldoDia(deposito);
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

    private void atualizarSaldoDia(BigDecimal montante) {
        final int dia = ZonedDateTime.now().getDayOfMonth();
        atualizarSaldoDia(montante, dia > 28 ? 28 : dia);
    }

    private void atualizarSaldoDia(BigDecimal montante, int dia) {
        final BigDecimal saldo = saldoDia.get(dia);
        saldoDia.put(dia, saldo != null ? saldo.add(montante): montante);
    }

    public BigDecimal calcularJuro() {
        final int dia = ZonedDateTime.now().getDayOfMonth();
        adicionarSaldo(saldoDia.get(dia).multiply(BigDecimal.valueOf(0.003)));
        return getSaldo();
    }
}
