
import java.util.Scanner;

// Activitat 08 — Taula de multiplicar d'un número (per teclat)
public class TaulaMultiplicar {
    public static void main(String[] args) {
        // TODO: llegeix un número enter per teclat i, amb un bucle,
        //   mostra la seva taula de multiplicar (de l'1 al 10)
        //   amb el format: "numero × 1 = ...", ..., "numero × 10 = ..."
        Scanner teclat =new Scanner(System.in); 
        System.out.println("Introdueix un número ");
        int n = teclat.nextInt(); 
        int i =1;
        
        while (i<=10){ 
        
        int resultat= i*n;
        System.out.println(n+" X "+i + " = " +resultat);
        i = i + 1; 
        }
    }
}
