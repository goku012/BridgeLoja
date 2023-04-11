import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcadaoTest {

    @Test
    void deveRetornarDescontoCalcadaoComCrianca() {
        Cliente cliente = new Crianca();
        Calcadao calcadao = new Calcadao(30.0f);
        calcadao.setCliente(cliente);
        assertEquals(30.0f, calcadao.calcularDesconto(), 0.01f);
    }

    @Test
    void deveRetornarDescontoCalcadaoComAssinante() {
        Cliente cliente = new Assinante();
        Calcadao calcadao = new Calcadao(30.0f);
        calcadao.setCliente(cliente);
        assertEquals(30.0f, calcadao.calcularDesconto(), 0.01f);
    }

    @Test
    void deveRetornarDescontoCalcadaoComIdoso() {
        Cliente cliente = new Idoso();
        Calcadao calcadao = new Calcadao(30.0f);
        calcadao.setCliente(cliente);
        assertEquals(30.0f, calcadao.calcularDesconto(), 0.01f);
    }

}