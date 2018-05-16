package io.github.midnightapps.epic;

import java.util.Random;

public class Dado extends Objeto {
    public int rolar(int faces) throws IllegalArgumentException {
        if(faces < 1) {
            throw new IllegalArgumentException("Valor para o argumento inválido.");
        }
        return new Random().ints(1, faces+1).findFirst().getAsInt();
    }
    public int rolarD4() {
        return rolar(4);
    }
    public int rolarD6() {
        return rolar(6);
    }
    public int rolarD8() {
        return rolar(8);
    }
    public int rolarD10() {
        return rolar(10);
    }
    public int rolarD12() {
        return rolar(12);
    }
    public int rolarD20() {
        return rolar(20);
    }
    public int rolarD100() {
        return rolar(100);
    }
}
