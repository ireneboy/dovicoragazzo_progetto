////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException("Per ora converto solo da 1 a 10.");
        }

        // Valori e simboli romani in ordine decrescente
        int[] values = {10, 9, 5, 4, 1};
        String[] romanLetters = {"X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();

        // Ciclo per sottrarre i valori e comporre la stringa
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number = number - values[i];
                roman.append(romanLetters[i]);
            }
        }

        return roman.toString();
    }
}