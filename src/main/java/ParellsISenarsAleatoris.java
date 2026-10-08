// Activitat 12 — Comptar parells i senars, aleatoris
import java.util.Random;
import java.util.Scanner;

public class ParellsISenarsAleatoris {
    public static void main(String[] args) {
        // TODO: demana quants números vol generar l'usuari (N)
        //   genera N números aleatoris (per exemple, entre 1 i 100, amb Random)
        //   compta'n quants són parells (numero % 2 == 0) amb un comptador
        //   i calcula els senars com N - parells
        //   Mostra: "Han sortit X números parells i Y senars"
         Random generador= new Random();
         Scanner teclat= new Scanner(System.in);
         int creus = 0;
        System.out.println("Introdueix un nombre: ");
        int n = teclat.nextInt();
        int i = 1;
        while (i <= n) {
            int numero = generador.nextInt(100) + 1; 
            
            if (numero % 2 == 0) {
                creus++; 
            }
            i= i + 1;
        }
        int cares = n - creus;
        System.out.println("Han sortit " + cares + " números parells i " + creus + " senars");
    }
}
