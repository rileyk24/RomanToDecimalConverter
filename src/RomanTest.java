import static org.junit.Assert.*;

public class RomanTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(Roman.romanToDecimal("XIV"), 14);
        assertEquals(Roman.romanToDecimal("hi mom"), -1); //inv
        assertEquals(Roman.romanToDecimal("DurhamAcademy"),-1 ); //inv
        assertEquals(Roman.romanToDecimal("HomeworkIsTerrible"),-1 ); //inv
        assertEquals(Roman.romanToDecimal("1missedSemicolon-_-"),-1 ); //inv
        assertEquals(Roman.romanToDecimal("IVIVIV"), 16); //log inc
        assertEquals(Roman.romanToDecimal("XXXXX"), 50); //log inc
        assertEquals(Roman.romanToDecimal("VIVI"),10 ); //log inc
        assertEquals(Roman.romanToDecimal("MCMC"), 2000); //log inc
        assertEquals(Roman.romanToDecimal("I"), 1); //cor
        assertEquals(Roman.romanToDecimal("XIV"), 14); //cor
        assertEquals(Roman.romanToDecimal("IV"), 4); //cor
        assertEquals(Roman.romanToDecimal("V"), 5); //cor
        assertEquals(Roman.romanToDecimal("XX"), 20); //cor
        assertEquals(Roman.romanToDecimal("XIII"), 13); //cor
        assertEquals(Roman.romanToDecimal("DCC"), 700); //cor
        assertEquals(Roman.romanToDecimal("CD"), 400); //cor
        assertEquals(Roman.romanToDecimal("XIX"), 19); //cor
        assertEquals(Roman.romanToDecimal("CCXL"), 240); //cor
        assertNotEquals(Roman.romanToDecimal("IV"), 6);
        assertNotEquals(Roman.romanToDecimal("CDCDXL"), 840);








    }
}