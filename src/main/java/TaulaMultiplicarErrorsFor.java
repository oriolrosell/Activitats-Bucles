// Activitat 19 — Taula de multiplicar amb comptador d'errors, amb for

import java.util.Scanner;

public class TaulaMultiplicarErrorsFor {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 13, però implementat fent servir un bucle for.
        //   Llegeix un número per teclat i, amb un for (de l'1 al 10), pregunta la
        //   seva taula de multiplicar: mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta i digues "correcte!" o "incorrecte!"
        //   (comptant els errors). Al final: "Has comès X errors!"
         Scanner teclat =new Scanner(System.in); 
        System.out.println("Introdueix un nombre: ");
        int n = teclat.nextInt();
        int i = 1; 
        int errors = 0;

        System.out.println("Comença la taula del " + n + " ---");

        for (i = 1; i <= 10; i++) {
            int resultatCorrecte = n * i;

            System.out.print(n + " X " + i + " = ");
            int respostaUsuari = teclat.nextInt();

            if (respostaUsuari == resultatCorrecte) {
                System.out.println(" Correcte! ");
            } else {
                System.out.println(" Incorrecte! El resultat era " + resultatCorrecte );
                errors=errors +1;
            }
    }
    System.out.println("Has comés "+errors+" errors");
    }
}
