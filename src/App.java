import java.util.Scanner;
import java.util.Arrays;

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

        menu();

        stampaRegistro(studenti, voti);
    }

    /**
     * Metodo che fa inserire all'utente una stringa che converte poi in intero, che sara' la scelta dello switch()
     * 
     * @return ritorna la scelta
     */
    public static int sceltaMenu(){
        String buffer = "";
        int scelta = -1;
        
        System.out.println("Inserisci scelta: ");
        buffer = tastiera.nextLine().trim();
        
        try{
            scelta = Integer.parseInt(buffer);
        }
        catch(NumberFormatException e){
            System.out.println ("La scelta inserito non e' valida, riprova");
        }

        return scelta;
    }

    /**
     * Stampa il menu 
     */
    public static void menu(){
        switch (scelta) {
            case value:
                
                break;
        
            default:
                break;
        }
    }

    /**
     * Carica array studenti
     * 
     * @param studenti array studenti
     */
    public static void caricaStudenti(String[] studenti){
        for(int i = 0; i < nStudenti; i++){
            System.out.println("Inserisci il nome dello studente " + (i+1) + ": ");
            studenti[i] = tastiera.nextLine().trim();
        }
    }

    /**
     * Carica array voti
     * 
     * @param voti array voti
     */
    public static void caricaVoti(int[] voti){
        String buffer[] = new String[nStudenti];
        for(int i = 0; i < nStudenti; i++){
            System.out.println("Inserisci il voto dello studente " + (i+1) + ": ");
            buffer[i] = tastiera.nextLine().trim();
            try{
                voti[i] = Integer.parseInt(buffer[i]);
            }
            catch(NumberFormatException e){
                System.out.println ("Il voto inserito non e' valido");
                i--;
            }
        }
    }

    /**
     * Stampo il "registro" (nomi + voti)
     * 
     * @param studenti array studenti
     * @param voti array voti
     */
    public static void stampaRegistro(String[] studenti, int[] voti){
        for(int i = 0; i < nStudenti; i++){
            System.out.println("Studente [" + (i+1) + "] = Nome: " + studenti[i] + " | Voto: " + voti[i]);
        }
    }
}