import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RennerTest {

    @Test
    void deveRetornarDescontoRennerComCrianca() {
        Cliente cliente = new Crianca();
        Pulma pulma = new Pulma(70.0f);
        pulma.setCliente(cliente);
        assertEquals(63.0f, pulma.calcularDesconto(), 0.01f);
    }

    @Test
    void deveRetornarDescontoRennerComAssinante() {
        Cliente cliente = new Assinante();
        Pulma pulma = new Pulma(70.0f);
        pulma.setCliente(cliente);
        assertEquals(56.0f, pulma.calcularDesconto(), 0.01f);
    }

    @Test
    void deveRetornarDescontoRennerComIdoso() {
        Cliente cliente = new Idoso();
        Renner renner = new Renner(70.0f);
        renner.setCliente(cliente);
        assertEquals(49.0f, renner.calcularDesconto(), 0.01f);
    }

}