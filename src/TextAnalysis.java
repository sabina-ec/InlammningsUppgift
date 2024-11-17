public class TextAnalysis {
    private int lineCount = 0;
    private int characterCount = 0;
    private int wordCount = 0;
    private String longestWord = "";

    // Metod för att uppdatera statistiken för en rad text
    public void updateStatistics(String text) {
        lineCount++; // Öka antal rader
        characterCount += text.length(); // Öka antal tecken

        // Dela upp texten i ord och uppdatera antal ord och längsta ord
        String[] words = text.split(" ");
        wordCount += words.length;

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













