import org.junit.Test;
import static org.junit.Assert.*;
public class TextAnalysisTest {

    @Test
//Test 1: Testar räkningen av rader, tecken och ord
    public void textAnalysisTest() {
        TextAnalysis textAnalysis = new TextAnalysis();

        textAnalysis.updateStatistics("Hej");
        textAnalysis.updateStatistics("Mitt namn är Sabina");

// Kontrollera räkningar med assertEquals
        assertEquals(2, textAnalysis.getLineCount());
        assertEquals(22,textAnalysis.getCharacterCount());
        assertEquals(5, textAnalysis.getWordCount());
    }

    @Test
    public void testShouldStop() {
        TextAnalysis analysis = new TextAnalysis();

        // Test när inmatningen är "stop" - metoden ska returnera true
        assertTrue(analysis.shouldStop("stop"));

        //// Test för olika kombinationer av stora och små bokstäver
        assertTrue(analysis.shouldStop("Stop"));
        assertTrue(analysis.shouldStop("STOP"));

        // Test när inmatningen är något annat än "stop" - metoden ska returnera false
        assertFalse(analysis.shouldStop("Sabina"));

    }
//Test som verifierar att metoden getLongestWord() korrekt returnerar det längsta ordet från given text
    @Test
    public void testGetLongestWord() {
        TextAnalysis analysis = new TextAnalysis();
//Uppdatera statistik med en rad och kontrollera längsta ordet
        analysis.updateStatistics("Jag heter Sabina Civgin");
        assertEquals("Sabina", analysis.getLongestWord()); //kontrollerar att det längsta ordet hittills är "Sabina".
}

}




