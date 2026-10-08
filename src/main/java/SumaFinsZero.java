// Activitat 21 — Suma acumulada, fins al 0

import java.util.Scanner;

public class SumaFinsZero {
    public static void main(String[] args) {
        // TODO: llegeix una seqüència de números per teclat (amb un bucle) fins que
        //   l'usuari entri un 0. Vés acumulant la suma en una variable (suma = suma + numero)
        //   i, per cada número (que no sigui 0), mostra "La suma fins ara és <suma>"
        //   Quan s'entri el 0, mostra "La suma total dels números introduïts és: <suma>"
        Scanner teclat= new Scanner(System.in);
        int n = 1;
        int suma = 0;
        while (n != 0){     
        System.out.println("Entra un número " );
        n= teclat.nextInt();
        suma = suma + n;
        if (n==0)
            System.out.println("Adeu");    
        
        else
            System.out.println("La suma fins ara és: " + suma);  

        }
        System.out.println("La suma total dels números introduïts és: " + suma);
    }
}
