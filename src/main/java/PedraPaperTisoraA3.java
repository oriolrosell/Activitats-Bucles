import java.util.Random;
import java.util.Scanner;

// Activitat 30 — Pedra, paper o tisora, a 3 victòries
public class PedraPaperTisoraA3 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();

        int victoriesUsuari = 0;
        int victoriesOrdinador = 0;

        while (victoriesUsuari < 3 && victoriesOrdinador < 3) {
            System.out.println("NOVA RONDA");
            System.out.print("Introdueix la teva opció (pedra, paper o tisora): ");
            String opcioUsuari = teclat.nextLine().trim().toLowerCase();

            int opcioUsuariNum = -1;
            if (opcioUsuari.equals("pedra")) {
                opcioUsuariNum = 0;
            } else if (opcioUsuari.equals("paper")) {
                opcioUsuariNum = 1;
            } else if (opcioUsuari.equals("tisora")) {
                opcioUsuariNum = 2;
            } else {
                System.out.println("Opció no vàlida. Torna-ho a intentar.");
                continue; 
            }

            int ordinador = generador.nextInt(3);

            String opcioOrdinadorText = "";
            if (ordinador == 0) {
                opcioOrdinadorText = "pedra";
            } else if (ordinador == 1) {
                opcioOrdinadorText = "paper";
            } else {
                opcioOrdinadorText = "tisora";
            }

            System.out.println("L'ordinador ha triat: " + opcioOrdinadorText);

            if (opcioUsuariNum == ordinador) {
                System.out.println("Empat en aquesta ronda!");
            } else if ((opcioUsuariNum == 0 && ordinador == 2) ||
                       (opcioUsuariNum == 1 && ordinador == 0) ||
                       (opcioUsuariNum == 2 && ordinador == 1)) {
                System.out.println("Has guanyat la ronda!");
                victoriesUsuari++;
            } else {
                System.out.println("L'ordinador guanya la ronda!");
                victoriesOrdinador++;
            }

            System.out.println("Marcador -> Tu: " + victoriesUsuari + " | Ordinador: " + victoriesOrdinador);
        }

       
        if (victoriesUsuari == 3) {
            System.out.println("FELICITATS! Enhorabona, has guanyat la partida!");
        } else {
            System.out.println("L'ordinador ha guanyat la partida. Més sort la pròxima vegada!");
        }
       

        teclat.close();
    }
}
