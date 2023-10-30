import java.util.Scanner;

public class App {
    static Scanner tastiera = new Scanner(System.in);

    static int nStudenti = 1;
    public static void main(String[] args) {
        String studenti[] = new String[nStudenti];
        int voti[] = new int[nStudenti];

        caricaStudenti(studenti);
        stampaStudenti(studenti);
    }

    public static void caricaStudenti(String[] studenti){
        for(int i = 0; i < nStudenti; i++){
            System.out.println("Inserisci il nome dello studente " + (i+1) + ": ");
            studenti[i] = tastiera.nextLine().trim();
        }
    }

    public static void stampaStudenti(String[] studenti){
        for(int i = 0; i < nStudenti; i++){
            System.out.println("Studente [" + (i+1) + "] = " + studenti[i]);
        }
    }
}
