////
// AURORA FRANCESCA DOVICO 2148002
// IRENE RAGAZZO 2147010
////

@Test
public void testPrintI() {
    String expected = 
        " _____  \n" +
        "|_   _| \n" +
        "  | |   \n" +
        "  | |   \n" +
        " _| |_  \n" +
        "|_____| \n";
    assertEquals(expected, RomanPrinter.print(1));
}