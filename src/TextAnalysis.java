//Skapar en publik klass som heter TextAnalysis, 
//som kommer att användas för att analysera text och 
//hålla reda på statistik som antal rader, tecken, ord och det längsta ordet.
public class TextAnalysis {
    //Deklaration av privata variabler
    private int lineCount = 0;
    private int characterCount = 0;
    private int wordCount = 0;
    private String longestWord = "";

    // Metod för att uppdatera statistiken för en rad text
    public void updateStatistics(String text) {
        lineCount++; // Post-inkrementering  -Öka antal rader
        characterCount += text.length(); // Öka antal tecken

        // Dela upp texten i ord och uppdatera antal ord och längsta ord
        String[] words = text.split(" ");
        wordCount += words.length;

        //enhanced for-loop  som itererar genom alla element i arrayen words
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; // Uppdatera längsta ordet om nödvändigt
            }
        }
    }

    // Metod för att kontrollera om texten är "stop"
    public boolean shouldStop(String text) {
        return text.equalsIgnoreCase("stop");
    }

    // Getters för att hämta statistiken
    public int getLineCount() {
        return lineCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }
}













