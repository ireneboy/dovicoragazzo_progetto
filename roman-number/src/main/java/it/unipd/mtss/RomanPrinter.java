////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return print(IntegerToRoman.convert(num));
    }

    private static String print(String romanString) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < 5; i++) { // Per ognuna delle 5 righe dell'ASCII Art
            for (char c : romanString.toCharArray()) {
                result.append(getCharLine(c, i));
            }
            result.append("\n");
        }
        
        return result.toString();
    }

    private static String getCharLine(char c, int riga) {
        switch (c) {
            case 'I': return printI(riga);
            case 'V': return printV(riga);
            case 'X': return printX(riga);
            // Aggiungerete poi L, C, D, M...
            default: return "";
        }
    }

    private static String printI(int riga) {
        String[] i = {
            " _____  ",
            "|_   _| ",
            "  | |   ",
            "  | |   ",
            " _| |_  ",
            "|_____| "
        };
        return i[riga];
    }

    private static String printV(int riga) {
        String[] v = {
            " __      __ ",
            " \\ \\    / / ",
            "  \\ \\  / /  ",
            "   \\ \\/ /   ",
            "    \\  /    ",
            "     \\/     "
        };
        return v[riga];
    }

    private static String printX(int riga) {
        String[] x = {
            "__  __ ",
            "\\ \\/ / ",
            " >  <  ",
            "/ /\\ \\ ",
            "/_/  \\_\\"
        };
        return x[riga];
    }
}