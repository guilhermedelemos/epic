package io.github.midnightapps.epic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DadoTest {
    @Test
    public void rolarTest() {
        Dado d = new Dado();
        assertEquals(1, d.rolar(1));
        int v = d.rolar(1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void rolarInvalidoTest() {
        Dado d = new Dado();
        d.rolar(0);
    }
    @Test
    public void rolarD4Test() {
        Dado d = new Dado();
        for(int i=0;i<1000; i++) {
            int v = d.rolarD4();
            if(v < 1 || v > 4) {
                fail("Valor inválido. Obtido: " + v + ". Esperado: [1..4]");
            }
        }
    }
    @Test
    public void rolarD6Test() {
        Dado d = new Dado();
        for(int i=0;i<1000; i++) {
            int v = d.rolarD6();
            if(v < 1 || v > 6) {
                fail("Valor inválido. Obtido: " + v + ". Esperado: [1..6]");
            }
        }
    }
    @Test
    public void rolarD8Test() {
        Dado d = new Dado();
        for(int i=0;i<1000; i++) {
            int v = d.rolarD8();
            if(v < 1 || v > 8) {
                fail("Valor inválido. Obtido: " + v + ". Esperado: [1..8]");
            }
        }
    }
    @Test
    public void rolarD10Test() {
        Dado d = new Dado();
        for(int i=0;i<1000; i++) {
            int v = d.rolarD10();
            if(v < 1 || v > 10) {
                fail("Valor inválido. Obtido: " + v + ". Esperado: [1..10]");
            }
        }
    }
    @Test
    public void rolarD12Test() {
        Dado d = new Dado();
        for(int i=0;i<1000; i++) {
            int v = d.rolarD12();
            if(v < 1 || v > 12) {
                fail("Valor inválido. Obtido: " + v + ". Esperado: [1..12]");
            }
        }
    }
    @Test
    public void rolarD20Test() {
        Dado d = new Dado();
        for(int i=0;i<1000; i++) {
            int v = d.rolarD20();
            if(v < 1 || v > 20) {
                fail("Valor inválido. Obtido: " + v + ". Esperado: [1..20]");
            }
        }
    }
    @Test
    public void rolarD100Test() {
        Dado d = new Dado();
        for(int i=0;i<1000; i++) {
            int v = d.rolarD100();
            if(v < 1 || v > 100) {
                fail("Valor inválido. Obtido: " + v + ". Esperado: [1..100]");
            }
        }
    }
}

