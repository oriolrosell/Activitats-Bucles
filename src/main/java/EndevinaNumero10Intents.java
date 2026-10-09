import java.util.Random;
import java.util.Scanner;

// Activitat 28 — Endevina el número, 10 intents
public class EndevinaNumero10Intents {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 100 (Random)
        //   amb un bucle while, la condició del qual combini "intents < 10" I
        //   "encara no s'ha encertat":
        //     demana un número, i digues si el número generat és més gran o més
        //   petit que el que ha entrat l'usuari, o si l'ha encertat
        //   Si s'esgoten els 10 intents sense encertar, informa'n l'usuari
        //   (mostrant, per exemple, quin era el número)
        Scanner teclat =new Scanner(System.in);
        Random generador = new Random();
        int nombreGenerat= generador.nextInt(100)+1;
        int intents=0;
        System.out.println("Endevina un número que he generat comprès entre 1 i 100 ");
        
        boolean encertat= false;
        while (!encertat&&intents<10){
            int intent= teclat.nextInt();
            intents=intents+1;
            if (intent==nombreGenerat)
                encertat=true;
            else if(intent<nombreGenerat)
                System.out.println("És més gran");
            else
                System.out.println("És més petit");
        }
            if(encertat)
                System.out.println("Correcte!");
            else
                System.out.println("Has esgotat els intents, el número era " +nombreGenerat);

    }
}
