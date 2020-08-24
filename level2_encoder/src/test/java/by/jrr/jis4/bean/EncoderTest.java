package by.jrr.jis4.bean;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncoderTest {

    @Test
    public void getSymbol() {
        Encoder encoder = new Encoder();
        encoder.setSymbol('A');

        char expected = 'A';
        char actual = encoder.getSymbol();
        assertEquals(expected, actual);
    }

    @Test
    public void getCode() {
        Encoder encoder = new Encoder();
        encoder.setCode((short) 66);

        short expected = 66;
        short actual = encoder.getCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsCode() {
        Encoder firstCode = new Encoder();
        firstCode.setCode((short)66);

        Encoder secondCode = new Encoder();
        secondCode.setCode((short)68);

        boolean expected = false;
        boolean actual = firstCode.equals(secondCode);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEqualsSymbol() {
        Encoder firstSymbol = new Encoder();
        firstSymbol.setSymbol('D');

        Encoder secondSymbol = new Encoder();
        secondSymbol.setSymbol('G');

        boolean expected = false;
        boolean actual = firstSymbol.equals(secondSymbol);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEqualsCodeTrue() {
        Encoder code = new Encoder();
        code.setCode((short) 66);

        boolean expected = true;
        boolean actual = code.equals(code);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEqualsCodeFalse() {
        Encoder code = new Encoder();
        code.setCode((short) 66);

        boolean expected = false;
        boolean actual = code.equals(false);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsSymbolTrue() {
        Encoder symbol = new Encoder();
        symbol.setSymbol('D');

        boolean expected = true;
        boolean actual = symbol.equals(symbol);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsSymbolFalse() {
       Encoder symbol = new Encoder();
        symbol.setSymbol('D');

        boolean expected = false;
        boolean actual = symbol.equals(false);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCodeForCode() {
        Encoder code = new Encoder();
        code.setCode((short) 66);

        Integer expected = 1027;
        Integer actual = code.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCodeForSymbol() {
        Encoder symbol = new Encoder();
        symbol.setSymbol('D');

        System.out.println(symbol.hashCode());
        Integer expected = 3069;
        Integer actual = symbol.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringForCode() {
        Encoder encoder = new Encoder();
        encoder.setSymbol('H');

        System.out.println(encoder.toString());
        String expected = "Endocoder{symbol=H, code=0}";
        String actual = encoder.toString();
        assertEquals(expected,actual);
    }
}