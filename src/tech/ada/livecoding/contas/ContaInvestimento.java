package tech.ada.livecoding.contas;

import java.math.BigDecimal;
import java.time.Instant;

public class ContaInvestimento extends Conta {

    private BigDecimal taxa;

    private BigDecimal capitalInicial;

    private Instant dataAbertura;

    public ContaInvestimento(BigDecimal taxa, BigDecimal capitalInicial) {
        super();
        this.taxa = BigDecimal.valueOf(Math.pow(
            taxa.divide(BigDecimal.valueOf(100)).add(BigDecimal.ONE).doubleValue(),
            BigDecimal.ONE.divide(BigDecimal.valueOf(365)).doubleValue()
        )).subtract(BigDecimal.ONE);
        this.capitalInicial = capitalInicial;
        dataAbertura = Instant.now();
    }

    public Instant getDataAbertura() {
        return this.dataAbertura;
    }

    public void render() {
        adicionarSaldo(
            getSaldo()
                .multiply(
                    taxa.divide(BigDecimal.valueOf(100))
                )
        );
    }

    @Override
    public BigDecimal transferir(BigDecimal montante, Conta destino) {
        removerSaldo(montante);
        destino.adicionarSaldo(montante);
        return getSaldo();
    }
}
