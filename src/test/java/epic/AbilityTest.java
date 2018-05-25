package epic;

import epic.core.Ability;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbilityTest {
    
    Ability ability;
    
    @Before
    public void setUp() throws Exception {
        this.ability = new Ability();
    }

    @Test
    public void modifierNegative5Test() {
        assertEquals(Integer.valueOf(-5), ability.modifier(1));
    }

    @Test
    public void modifierNegative4Test() {
        assertEquals(Integer.valueOf(-4), ability.modifier(2));
        assertEquals(Integer.valueOf(-4), ability.modifier(3));
    }

    @Test
    public void modifierNegative3Test() {
        assertEquals(Integer.valueOf(-3), ability.modifier(4));
        assertEquals(Integer.valueOf(-3), ability.modifier(5));
    }

    @Test
    public void modifierNegative2Test() {
        assertEquals(Integer.valueOf(-2), ability.modifier(6));
        assertEquals(Integer.valueOf(-2), ability.modifier(7));
    }

    @Test
    public void modifierNegative1Test() {
        assertEquals(Integer.valueOf(-1), ability.modifier(8));
        assertEquals(Integer.valueOf(-1), ability.modifier(9));
    }

    @Test
    public void modifier0Test() {
        assertEquals(Integer.valueOf(0), ability.modifier(10));
        assertEquals(Integer.valueOf(0), ability.modifier(11));
    }

    @Test
    public void modifier1Test() {
        assertEquals(Integer.valueOf(1), ability.modifier(12));
        assertEquals(Integer.valueOf(1), ability.modifier(13));
    }

    @Test
    public void modifier2Test() {
        assertEquals(Integer.valueOf(2), ability.modifier(14));
        assertEquals(Integer.valueOf(2), ability.modifier(15));
    }

    @Test
    public void modifier3Test() {
        assertEquals(Integer.valueOf(3), ability.modifier(16));
        assertEquals(Integer.valueOf(3), ability.modifier(17));
    }

    @Test
    public void modifier4Test() {
        assertEquals(Integer.valueOf(4), ability.modifier(18));
        assertEquals(Integer.valueOf(4), ability.modifier(19));
    }

    @Test
    public void modifier5Test() {
        assertEquals(Integer.valueOf(5), ability.modifier(20));
        assertEquals(Integer.valueOf(5), ability.modifier(21));
    }

    @Test
    public void modifier6Test() {
        assertEquals(Integer.valueOf(6), ability.modifier(22));
        assertEquals(Integer.valueOf(6), ability.modifier(23));
    }

    @Test
    public void modifier7Test() {
        assertEquals(Integer.valueOf(7), ability.modifier(24));
        assertEquals(Integer.valueOf(7), ability.modifier(25));
    }

    @Test
    public void modifier8Test() {
        assertEquals(Integer.valueOf(8), ability.modifier(26));
        assertEquals(Integer.valueOf(8), ability.modifier(27));
    }

    @Test
    public void modifier9Test() {
        assertEquals(Integer.valueOf(9), ability.modifier(28));
        assertEquals(Integer.valueOf(9), ability.modifier(29));
    }

    @Test
    public void modifier10Test() {
        assertEquals(Integer.valueOf(10), ability.modifier(30));
    }
}
