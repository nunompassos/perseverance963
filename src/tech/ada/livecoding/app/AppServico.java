package tech.ada.livecoding.app;

import java.math.BigDecimal;

import tech.ada.livecoding.contas.Conta;
import tech.ada.livecoding.contas.ContaCorrente;
import tech.ada.livecoding.contas.ContaSacavel;

public class AppServico {

    public static void main(String[] args) {
        final Conta c = new ContaCorrente();
        final ContaSacavel c2 = new ContaCorrente();

        //c.depositar(BigDecimal.TEN);
        c2.sacar(BigDecimal.ONE);
        //c.transferir(BigDecimal.ONE, c2);
        System.out.println(c);
        System.out.println(c2);
    }
}
