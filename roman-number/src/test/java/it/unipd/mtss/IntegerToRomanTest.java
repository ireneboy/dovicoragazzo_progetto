////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConversioneUnoADieci() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConversioneUndiciAVenti() {
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XV", IntegerToRoman.convert(15));
        assertEquals("XVIII", IntegerToRoman.convert(18));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroSottoIlRange() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroSopraIlRange() {
        // Ora il limite è 20, quindi il primo numero che deve dare errore è 21
        IntegerToRoman.convert(21);
    }
}