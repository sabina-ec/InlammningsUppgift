import org.junit.Test;             // Importerar JUnit-testverktyget
import static org.junit.Assert.*; // Importerar statiska metoder från Assert-klassen

// Här definieras en testklass för att testa funktionerna i TextAnalysis-klassen.
public class TextAnalysisTest {

    @Test   // Markerar metoden som ett testfall med JUnit
//Test 1: Testar räkningen av rader, tecken och ord
    public void textAnalysisTest() {
        TextAnalysis textAnalysis = new TextAnalysis(); //Skapar en ny instans av TextAnalysis-klassen

        textAnalysis.updateStatistics("Hej"); //Uppdaterar statistik med första raden ("Hej")
        textAnalysis.updateStatistics("Mitt namn är Sabina"); // Uppdaterar statistik med andra raden ("Mitt namn är Sabina")

// Kontrollera räkningar med assertEquals
        assertEquals(2, textAnalysis.getLineCount()); // Kontrollera om radräkningen är korrekt (2 rader)
        assertEquals(22,textAnalysis.getCharacterCount());// Kontrollera om teckenräkningen är korrekt (22 tecken inklusive mellanslag)
        assertEquals(5, textAnalysis.getWordCount());      // Kontrollera om ordräkningen är korrekt (5 ord)
    }

    @Test
    public void testShouldStop() {
        TextAnalysis analysis = new TextAnalysis();  //Skapar en ny instans av TextAnalysis-klassen

        // Test när inmatningen är "stop" - metoden ska returnera true
        assertTrue(analysis.shouldStop("stop"));

        // Test för olika kombinationer av stora och små bokstäver
        assertTrue(analysis.shouldStop("Stop"));
        assertTrue(analysis.shouldStop("STOP"));

        // Test när inmatningen är något annat än "stop" - metoden ska returnera false
        assertFalse(analysis.shouldStop("Sabina"));

    }
//Test som verifierar att metoden getLongestWord() korrekt returnerar det längsta ordet från given text
    @Test
    public void testGetLongestWord() {
        TextAnalysis analysis = new TextAnalysis(); //Skapar en ny instans av TextAnalysis-klassen

        //Uppdatera statistik med en rad och kontrollera längsta ordet
        analysis.updateStatistics("Jag heter Sabina Civgin");
        assertEquals("Sabina", analysis.getLongestWord()); //kontrollerar att det längsta ordet hittills är "Sabina".
}

}




