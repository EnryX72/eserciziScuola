import java.util.Scanner;

public class App {
    static Scanner tastiera = new Scanner(System.in);

    static int nStudenti = 1;

    /**
     * Main
     * 
     * @param args Prende input da terminale
     */
    public static void main(String[] args) {
        String studenti[] = new String[nStudenti];
        int voti[] = new int[nStudenti];

        caricaStudenti(studenti);
        caricaVoti(voti);

        while (true) {
            menu(studenti, voti);
        }
    }

    /**
     * Metodo che fa inserire all'utente una stringa che converte poi in intero, che
     * sara' la scelta dello switch()
     * 
     * @return ritorna la scelta
     */
    public static int sceltaMenu() {
        boolean valid = false;
        int scelta = -1;

        while (!valid) {
            String buffer = "";
            System.out.println("Inserisci scelta: ");
            buffer = tastiera.nextLine().trim();

            try {
                scelta = Integer.parseInt(buffer);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("La scelta inserito non e' valida, riprova");
            }
        }

        return scelta;
    }

    public static void printMenu() {
        System.out.println("---------- MENU ----------");
        System.out.println("");
        System.out.println("1 - Stampa un resoconto dei dati inseriti");
        System.out.println("2 - Imposta le iniziali dei nomi maiuscole");
        System.out.println("");
    }

    /**
     * Suddivide scelte del menu
     */
    public static void menu(String[] studenti, int[] voti) {
        printMenu();

        switch (sceltaMenu()) {
            case 1: {
                // Stampa un resoconto dei dati inseriti
                stampaRegistro(studenti, voti);
                break;
            }

            case 2: {
                // Imposta le iniziali dei nomi maiuscole
                nomiMaiuscole(studenti);
                break;
            }

            default: {
                // Output in caso di mismatch
                System.out.println("Non valido, riprova");
                break;
            }
        }
    }

    /**
     * Carica array studenti
     * 
     * @param studenti array studenti
     */
    public static void caricaStudenti(String[] studenti) {
        for (int i = 0; i < nStudenti; i++) {
            System.out.println("Inserisci il nome dello studente " + (i + 1) + ": ");
            studenti[i] = tastiera.nextLine().trim();
        }
    }

    /**
     * Carica array voti
     * 
     * @param voti array voti
     */
    public static void caricaVoti(int[] voti) {
        String buffer[] = new String[nStudenti];
        for (int i = 0; i < nStudenti; i++) {
            System.out.println("Inserisci il voto dello studente " + (i + 1) + ": ");
            buffer[i] = tastiera.nextLine().trim();
            try {
                // controllo che il voto sia effettivmanete un intero
                voti[i] = Integer.parseInt(buffer[i]);
            } catch (NumberFormatException e) {
                System.out.println("Il voto inserito non e' valido");
                i--;
            }

            while (voti[i] > 10 || voti[i] < 3) {
                // controllo che il voto sia compreso tra 3 e 10 inclusi
                System.out.println("Il voto inserito non e' valido");
                i--;
            }
        }
    }

    /**
     * Stampo il "registro" (nomi + voti)
     * 
     * @param studenti array studenti
     * @param voti     array voti
     */
    public static void stampaRegistro(String[] studenti, int[] voti) {
        for (int i = 0; i < nStudenti; i++) {
            System.out.println("Studente [" + (i + 1) + "] = Nome: " + studenti[i] + " | Voto: " + voti[i]);
        }
    }

    /**
     * Imposta le iniziali dei nomi degli studenti maiuscole
     * 
     * @param studenti array studenti
     */
    public static void nomiMaiuscole(String[] studenti){
        for(int i = 0; i < nStudenti; i++){
            String[] sezioni = studenti[i].split(" ");  //creo varie sezioni della stringa, le quali equivalgono ad una parola del nome
            studenti[i] = "";   //azzero la stringa col nome
            for(int j = 0; j < sezioni.length; j++){    //for che cicla le varie sezioni
                studenti[i] += sezioni[j].substring(0, 1).toUpperCase() + sezioni[j].substring(1);
                if(j != sezioni.length-1){  //se il contatore delle sezioni non e' all'ultima
                    studenti[i] += " "; //aggiungi uno spazio dopo la sezione
                }
                //il nome dello studente si compone quindi da: sottostringa(0,1) ovvero primo carattere che diventa maiuscolo, e il resto che resta uguale
            }
        }
    }
}