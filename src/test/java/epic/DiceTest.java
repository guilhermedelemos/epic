package epic;

import epic.core.Dice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DiceTest {

    Dice die;

    @Before
    public void setUp() throws Exception {
        this.die = new Dice();
    }

    @Test
    public void rollTest() {
        assertEquals(1, die.roll(1));
        int v = die.roll(1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void invalidRollTest() {
        Dice d = new Dice();
        die.roll(0);
    }
    @Test
    public void rollD4Test() {
        Dice d = new Dice();
        for(int i=0;i<1000; i++) {
            int v = die.rollD4();
            if(v < 1 || v > 4) {
                fail("Invalid value. Got: " + v + ". Expected: [1..4]");
            }
        }
    }
    @Test
    public void rollD6Test() {
        Dice d = new Dice();
        for(int i=0;i<1000; i++) {
            int v = die.rollD6();
            if(v < 1 || v > 6) {
                fail("Invalid value. Got: " + v + ". Expected: [1..6]");
            }
        }
    }
    @Test
    public void rollD8Test() {
        Dice d = new Dice();
        for(int i=0;i<1000; i++) {
            int v = die.rollD8();
            if(v < 1 || v > 8) {
                fail("Invalid value. Got: " + v + ". Expected: [1..8]");
            }
        }
    }
    @Test
    public void rollD10Test() {
        Dice d = new Dice();
        for(int i=0;i<1000; i++) {
            int v = die.rollD10();
            if(v < 1 || v > 10) {
                fail("Invalid value. Got: " + v + ". Expected: [1..10]");
            }
        }
    }
    @Test
    public void rollD12Test() {
        Dice d = new Dice();
        for(int i=0;i<1000; i++) {
            int v = die.rollD12();
            if(v < 1 || v > 12) {
                fail("Invalid value. Got: " + v + ". Expected: [1..12]");
            }
        }
    }
    @Test
    public void rollD20Test() {
        Dice d = new Dice();
        for(int i=0;i<1000; i++) {
            int v = die.rollD20();
            if(v < 1 || v > 20) {
                fail("Invalid value. Got: " + v + ". Expected: [1..20]");
            }
        }
    }
    @Test
    public void rollD100Test() {
        Dice d = new Dice();
        for(int i=0;i<1000; i++) {
            int v = die.rollD100();
            if(v < 1 || v > 100) {
                fail("Invalid value. Got: " + v + ". Expected: [1..100]");
            }
        }
    }
}

