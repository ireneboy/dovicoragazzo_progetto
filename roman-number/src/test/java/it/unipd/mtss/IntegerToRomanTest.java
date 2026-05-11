////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////


package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConversioneMille() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void testCasiSpecialiGrandi() {
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void testNumeriComplessi() {
        assertEquals("CDXLIV", IntegerToRoman.convert(444));
        assertEquals("DCCCLXXXVIII", IntegerToRoman.convert(888));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSopraMille() {
        IntegerToRoman.convert(1001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSottoUno() {
        IntegerToRoman.convert(0);
    }
}