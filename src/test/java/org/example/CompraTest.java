package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveComprarUtilizandoTransportadoraA() {
        Compra compra = new Compra();
        compra.comprarComTransportadoraA(100.0f, 1.0f, 10);
        assertEquals(115.0f, compra.getValorTotal());
    }

    @Test
    void deveComprarUtilizandoTransportadoraB() {
        Compra compra = new Compra();
        compra.comprarComTransportadoraB(100.0f, 1.0f, 10);
        assertEquals(116.5f, compra.getValorTotal());
    }

    @Test
    void deveComprarUtilizandoTransportadoraC() {
        Compra compra = new Compra();
        compra.comprarComTransportadoraC(100.0f, 1.0f, 10);
        assertEquals(118.0f, compra.getValorTotal());
    }

}