import java.util.Scanner;

public class App {
    static Scanner tastiera = new Scanner(System.in);

    static int nStudenti = 5;
    public static void main(String[] args) {
        String studenti[] = new String[nStudenti];
        int voti[] = new int[nStudenti];

        caricaStudenti(studenti);
    }

    public static void caricaStudenti(String[] studenti){
        for(int i = 0; i < nStudenti; i++){
            System.out.println("Inserisci il nome dello studnete " + (i+1) + ": ");
            studenti[i] = tastiera.nextLine();
        }
    }
}
