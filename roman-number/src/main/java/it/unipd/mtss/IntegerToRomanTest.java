// INCOLLA QUI IL CONTENUTO DEL FILE LICENSE.TXT (Nomi, Cognomi, Matricole)
////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConversioneNumero1() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConversioneNumero2() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConversioneNumero3() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroMinoreDiUno() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroMaggioreDiTre() {
        IntegerToRoman.convert(4);
    }
}