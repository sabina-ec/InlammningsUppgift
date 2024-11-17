import java.util.Scanner;   //Denna rad importerar klassen Scanner från Javas bibliotek,

//Här definierar jag klassen TextApp, som innehåller main-metoden
public class TextApp {
    public static void main(String[] args) {
        TextAnalysis analysis = new TextAnalysis(); // Instans av TextAnalysis
        Scanner scanner = new Scanner(System.in);//jag skapar ett Scanner-objekt för att ta emot indata från användaren via konsolen.
        //Skriv ut instruktioner till användaren
        System.out.println("Skriv in text rad för rad (skriv 'stop' för att avsluta):");

        String input; //Deklarera variabeln input

        //do-while-loopen för textinmatning
        do {
            input = scanner.nextLine();

            // Kontrollera om "stop" har skrivits
            if (analysis.shouldStop(input)) {
                break;
            }

            // Uppdatera statistiken med inmatningen
            analysis.updateStatistics(input);

        } while (true);

        scanner.close();  //Stäng Scanner-objektet

        // Skriv ut resultaten
        System.out.println("Antal rader: " + analysis.getLineCount());
        System.out.println("Antal tecken: " + analysis.getCharacterCount());
        System.out.println("Antal ord: " + analysis.getWordCount());
        System.out.println("Längsta ord: " + analysis.getLongestWord());
    }
}