package no.hvl.dat102.oblig2.parenteser;
import no.hvl.dat102.oblig2.del1.ParentesSjekker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParentesSjekkerTest {

    @Test
    void test() {
        assertTrue(ParentesSjekker.sjekkParenteser("{ [ ( ) ] }"), "s1 skal være korrekt");
        assertFalse(ParentesSjekker.sjekkParenteser("{ [ ( ) }"), "s2 skal være ikke korrekt");
        assertFalse(ParentesSjekker.sjekkParenteser("[ ( ) ] }"), "s3 skal være ikke korrekt");
        assertFalse(ParentesSjekker.sjekkParenteser("{ [ ( ] ) }"), "s4 skal være ikke korrekt");
        assertTrue(ParentesSjekker.sjekkParenteser("""
            class HelloWorld {
                public static void main(String[] args) {
                    System.out.println("Hello World!");
                }
            }"""), "s5 skal være korrekt");
        assertTrue(ParentesSjekker.sjekkParenteser(""), "s6 skal være korrekt");
        assertTrue(ParentesSjekker.sjekkParenteser("()"), "s7 skal være korrekt");
    }
}