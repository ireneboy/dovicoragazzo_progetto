////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////

package it.unipd.mtss;


public class IntegerToRoman {

    
    public static String convert(int number) {
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 6.");
        }

        if (number == 6) { return "VI"; }
        if (number == 5) { return "V"; }
        if (number == 4) { return "IV"; }
        if (number == 3) { return "III"; }
        if (number == 2) { return "II"; }
        
        return "I";
    }
}