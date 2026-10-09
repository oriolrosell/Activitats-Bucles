import java.util.Scanner;
// Activitat 27 — Login amb 3 intents (condició d'acabament complexa)
public class LoginTresIntents {
    public static void main(String[] args) {
        // TODO: guarda l'usuari i la contrasenya correctes en dues variables
        //   (per exemple "cponts" / "qw34T1234")
        //   amb un bucle while, la condició del qual combini "intents < 3" I
        //   "encara no s'ha encertat" (condició d'acabament complexa):
        //     demana usuari i contrasenya, comprova si són correctes
        //     mostra "Usuari i contrasenya correctes!" o un missatge d'error
        //     incrementa el comptador d'intents
        //   ⛔ NO facis servir break (ni similar), ni alteris el comptador
        //      d'intents per forçar la sortida del bucle
        //   Si s'acaben els 3 intents sense encertar, mostra "Usuari bloquejat!"
        final String username = "cponts";
        final String password = "qw34T1234";
        Scanner teclat= new Scanner(System.in);
        int i=1;
        while(i<=3){
         System.out.println("Introdueix el usuari");
         String usuari= teclat.nextLine();
         System.out.println("Introdueix la contrasenya");
         String contrasenya= teclat.nextLine();
         if (username.equals(usuari)  && password.equals(contrasenya))
            System.out.println("Pots accedir, contrasenya i usuari correctes");
        else
            System.out.println("No pots accedir, contrasenya o usuari incorrectes");
        i=i+1;
    }
        System.out.println("Usuari1 bloquejat!");
    }
}
