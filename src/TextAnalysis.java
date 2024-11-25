//Skapar en publik klass som heter TextAnalysis, 
//som kommer att användas för att analysera text och 
//hålla reda på statistik som antal rader, tecken, ord och det längsta ordet.
public class TextAnalysis {
    //Deklaration av privata variabler
    //Variablerna är privata för att skydda dem från direkt åtkomst eller modifiering utanför klassen.
    private int lineCount = 0;          //Ingen rad har analyserats ännu, så räkningen börjar från noll.
    private int characterCount = 0;    //Inga tecken har analyserats ännu.
    private int wordCount = 0;        // Inga ord har analyserats ännu.
    private String longestWord = ""; //Det längsta ordet är okänt vid start, så det sätts till en tom sträng.

    // Metod för att uppdatera statistiken för en rad text
    public void updateStatistics(String text) {
        lineCount++; // Post-inkrementering  -Öka antal rader med varje anrop av metoden.
        characterCount += text.length(); // Öka antal tecken baserat på längden av den givna texten.
                                          
        // Dela upp texten i ord och uppdatera antal ord och längsta ord
        String[] words = text.split(" "); //Metoden split(" ") delar upp strängen text i en array av ord baserat på mellanslag som avgränsare.
        wordCount += words.length;       //Lägger till antalet ord i det totala antalet ord.
                                        //Det betyder att värdet av variabeln wordCount ökas med antalet element i arrayen words.
        //enhanced for-loop  som itererar genom alla element i arrayen words
        for (String word : words) {
            if (word.length() > longestWord.length()) {         //Kontrollerar om det nuvarande ordet har större längd än det nuvarande längsta ordet.
                longestWord = word; // Uppdatera längsta ordet om nödvändigt
            }
        }
    }

    // Metod för att kontrollera om texten är "stop"
    public boolean shouldStop(String text) {
        return text.equalsIgnoreCase("stop"); //kontrollera om värdet på variabeln text är lika med strängen "stop"
                                             // oavsett skillnad mellan stora och små bokstäver.
                                            // Om strängarna är lika returneras true, annars false.
    }

    // Getters som används för att hämta värden av privata variabler i  detta fall för att hämta statistiken.
    public int getLineCount() {
        return lineCount;    //Returnerar värdet av lineCount, som visar totalt antal rader.
    }

    public int getCharacterCount() {
        return characterCount;  //	Returnerar värdet av characterCount, som visar totalt antal tecken.
    }

    public int getWordCount() {
        return wordCount;  //	Returnerar värdet av wordCount, som visar totalt antal ord.
    }

    public String getLongestWord() {
        return longestWord;  //Returnerar longestWord, vilket visar det längsta ordet som hittills har hittats i texten.
    }
}













