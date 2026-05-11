////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////


package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConversioneLimitiEBase() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testCasiSpeciali() {
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void testNumeriCompostiComplessi() {
        assertEquals("XLIV", IntegerToRoman.convert(44));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("LXXXVIII", IntegerToRoman.convert(88));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSottoRange() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSopraRange() {
        IntegerToRoman.convert(101);
    }
}