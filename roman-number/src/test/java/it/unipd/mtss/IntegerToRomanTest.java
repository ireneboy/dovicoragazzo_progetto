////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConversioneNumeriUnoATre() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConversioneNumeriQuattroASei() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroMinoreDiUno() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroMaggioreDiSei() {
        IntegerToRoman.convert(7);
    }

    @Test
    public void testConversioneNumero7() {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void testConversioneNumero8() {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void testConversioneNumero9() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConversioneNumero10() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    // --- TEST DEI CASI LIMITE AGGIORNATI ---
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroMinoreDiUno() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroMaggioreDiDieci() {
        // Ora testiamo l'11, perché fino a 10 è tutto valido!
        IntegerToRoman.convert(11);
    }
}