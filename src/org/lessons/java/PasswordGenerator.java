package src.org.lessons.java;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        String nome;
        String cognome;
        String colorePreferito;
        int dataGiorno;
        int dataMese;
        int dataAnno;
        // nome = "Antonio";
        // cognome = "Rossi";
        // colorePreferito = "blu";
        // dataGiorno = 20;
        // dataMese = 12;
        // dataAnno = 2024;
        
        Scanner input = new Scanner(System.in);
        System.out.println("scrivi nome utente: ");
        nome = input.nextLine();
        
        System.out.println("scrivi cognome utente: ");
        cognome = input.nextLine();
        
        System.out.println("scrivi colore utente: ");
        colorePreferito = input.nextLine();
        
        System.out.println("scrivi in successione con un invio; giorno, mese, anno: ");
        dataGiorno = input.nextInt();
        dataMese = input.nextInt();
        dataAnno = input.nextInt();

        int dataSomma = dataGiorno + dataMese + dataAnno;

        System.out.println("Il mio utente si chiama " + nome + " " + cognome + ", " + "nato il " + dataGiorno + "/"
                + dataMese + "/" + dataAnno + " il cui colore preferito è il " + colorePreferito + ".");
        System.out.println("La sua password sarà " + nome + "-" + cognome + "-" + colorePreferito + "-" + dataSomma);

        input.close();
    }
}
