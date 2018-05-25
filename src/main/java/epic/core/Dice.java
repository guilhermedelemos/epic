package epic.core;

import java.util.Random;

public class Dice extends epic.core.Object {
    public int roll(int faces) throws IllegalArgumentException {
        if(faces < 1) {
            throw new IllegalArgumentException("The value for argument is invalid.");
        }
        return new Random().ints(1, faces+1).findFirst().getAsInt();
    }
    public int rollD4() {
        return roll(4);
    }
    public int rollD6() {
        return roll(6);
    }
    public int rollD8() {
        return roll(8);
    }
    public int rollD10() {
        return roll(10);
    }
    public int rollD12() {
        return roll(12);
    }
    public int rollD20() {
        return roll(20);
    }
    public int rollD100() {
        return roll(100);
    }
}
