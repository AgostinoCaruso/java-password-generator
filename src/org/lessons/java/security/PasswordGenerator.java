public class PasswordGenerator {

    public static void main(String[] args) {
        String nome;
        String cognome;
        String colorePreferito;
        int dataGiorno;
        int dataMese;
        int dataAnno;
        nome = "Antonio";
        cognome = "Rossi";
        colorePreferito = "blu";
        dataGiorno = 20;
        dataMese = 12;
        dataAnno = 2024;
        int dataSomma = dataGiorno + dataMese + dataAnno;
        System.out.println("Il mio utente si chiama " + nome + " " + cognome + ", " + "nato il " + dataGiorno + "/"
                + dataMese + "/" + dataAnno + " il cui colore preferito è il " + colorePreferito + ".");
        System.out.println("La sua password sarà " + nome + "-" + cognome + "-" + colorePreferito + "-" + dataSomma);
    }
}
