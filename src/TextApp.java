import java.util.Scanner;   //Denna rad importerar klassen Scanner från Javas bibliotek,

//Här definierar jag klassen TextApp, som innehåller main-metoden
public class TextApp {
    public static void main(String[] args) {
        TextAnalysis analysis = new TextAnalysis(); // Instans av TextAnalysis
        Scanner scanner = new Scanner(System.in);//jag skapar ett Scanner-objekt för att ta emot indata från användaren via konsolen.
        //Skriv ut instruktioner till användaren
        System.out.println("Skriv in text rad för rad (skriv 'stop' för att avsluta):");

        String input;//Deklarera variabeln input 
        //Variabeln används för att tillfälligt lagra varje rad text som användaren matar in innan den analyseras.

        //do-while-loopen för textinmatning
        do {
            input = scanner.nextLine(); // Läs in en rad text från användaren

            //  Kontrollera om användaren har skrivit "stop" för att avsluta
            if (analysis.shouldStop(input)) {
                break;  //Avslutar loopen om "stop" har skrivits
            }

            // Uppdaterar statistik (rader, ord och tecken) med den inmatade texten
            analysis.updateStatistics(input);

        } while (true);  //Loopen fortsätter tills användaren skriver "stop"

        scanner.close();  //Stäng Scanner-objektet

        // Skriv ut resultaten
        System.out.println("Antal rader: " + analysis.getLineCount()); // Skriver ut det totala antalet rader som användaren har matat in
        System.out.println("Antal tecken: " + analysis.getCharacterCount()); // Skriver ut det totala antalet tecken (inklusive mellanslag) från inmatningen
        System.out.println("Antal ord: " + analysis.getWordCount());  // Skriver ut det totala antalet tecken (inklusive mellanslag) från inmatningen
        System.out.println("Längsta ord: " + analysis.getLongestWord());// Skriver ut det längsta ordet som har hittats under analysen
    }
}
