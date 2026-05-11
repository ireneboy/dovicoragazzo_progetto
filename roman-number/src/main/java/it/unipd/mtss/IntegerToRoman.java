////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
    if (number < 1 || number > 20) {
        throw new IllegalArgumentException("Numero fuori range (1-20)");
    }

    // Tabelle di conversione
    int[] values = {10, 9, 5, 4, 1};
    String[] symbols = {"X", "IX", "V", "IV", "I"};

    StringBuilder roman = new StringBuilder();

    for (int i = 0; i < values.length; i++) {
        while (number >= values[i]) {
            roman.append(symbols[i]);
            number -= values[i];
        }
    }
    return roman.toString();
}

private static String printX(int riga) {
    String[] x = {
        "__  __",
        "\\ \\/ /",
        " >  < ",
        "/ ./\\ \\",
        "/_/  \\_\\"
    };
    return x[riga];
}
}