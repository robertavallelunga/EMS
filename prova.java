import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Definizione della classe
public class Main {

    // Metodo main, il punto di ingresso del programma
    public static void main(String[] args) {

        // Crea un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Stampa un messaggio di benvenuto
        System.out.println("Benvenuto nel programma!");

        // Chiedi all'utente di inserire un numero
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        // Stampa il doppio del numero inserito
        System.out.println("Il doppio del numero è: " + (numero * 2));

        // Crea una lista di stringhe
        List<String> nomi = new ArrayList<>();

        // Aggiungi alcuni nomi alla lista
        nomi.add("Alice");
        nomi.add("Bob");
        nomi.add("Charlie");

        // Stampa la lista di nomi
        System.out.println("Lista di nomi: " + nomi);

        // Chiudi lo scanner
        scanner.close();
    }
}