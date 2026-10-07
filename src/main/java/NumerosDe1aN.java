// Activitat 06 — Números d'1 fins a N

import java.util.Scanner;

public class NumerosDe1aN {
    public static void main(String[] args) {
        // TODO: llegeix un número enter N per teclat
        //   i mostra, amb un bucle, tots els números d'1 fins a N (un per línia)
        Scanner teclat= new Scanner(System.in);
        
        int i =1;
        System.out.println("Introdueix un nombre: ");
        int n = teclat.nextInt();
        while (i<=n){ 
        System.out.println(i);
        i = i + 1; 
        } 
    }
}
