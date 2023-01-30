package tech.ada.livecoding.contas;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class ContaPoupanca extends Conta implements ContaSacavel, ContaDepositavel {

    private Map<Integer, BigDecimal> saldoDia = new HashMap();
    @Override
    public BigDecimal sacar(BigDecimal saque) {
        removerSaldo(saque);
        removerSaldoDia(saque);
        return getSaldo();
    }

    @Override
    public BigDecimal depositar(BigDecimal deposito) {
        adicionarSaldo(deposito);
        adicionarSaldoDia(deposito);
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

    private void adicionarSaldoDia(BigDecimal montante) {
        final int dia = ZonedDateTime.now().getDayOfMonth();
        adicionarSaldoDia(montante, dia > 28 ? 28 : dia);
    }

    private void adicionarSaldoDia(BigDecimal montante, int dia) {
        final BigDecimal saldo = saldoDia.get(dia);
        saldoDia.put(dia, saldo != null ? saldo.add(montante): montante);
    }

    private void removerSaldoDia(BigDecimal montante) {
        final int dia = ZonedDateTime.now().getDayOfMonth();
        removerSaldoDia(montante, dia > 28 ? 28 : dia);
    }

    private void removerSaldoDia(BigDecimal montante, int dia) {
        BigDecimal saldo = saldoDia.get(dia);
        if (saldo != null) {
            saldoDia.put(dia, saldo.compareTo(montante) >= 0 ? saldo.subtract(montante) : saldo);
        } else {
            saldo = BigDecimal.ZERO;
        }
        if (saldo.compareTo(montante) < 0) {
            removerSaldoDia(montante.subtract(saldo), dia == 1 ? 28 : dia - 1);
        }
    }

    public BigDecimal calcularJuro() {
        final int dia = ZonedDateTime.now().getDayOfMonth();
        adicionarSaldo(saldoDia.get(dia).multiply(BigDecimal.valueOf(0.003)));
        return getSaldo();
    }
}
