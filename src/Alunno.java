//ancora da cpaire come si usa un 'record', ho buttatro giu un metodo costruttore (credo) e i 3 getX().... 
//ma non implemento nula perche' non vorrei fosse esageratamente sbagliato
public class Alunno {
    private String nome;
    private int anni;
    private char genere;

    private Alunno() {
        String nome = "";
        int anni = -1;
        char genere = 'M';
    }

    public String getNome() {
        return nome;
    }

    public int getAnni() {
        return anni;
    }

    public char getGenere() {
        return genere;
    }
}