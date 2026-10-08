// Activitat 10 — Números de N fins a 1

import java.util.Scanner;

public class NumerosDeNa1 {
    public static void main(String[] args) {
        // TODO: llegeix un número enter N per teclat
        //   i mostra, amb un bucle, tots els números des de N fins a 1 (un per línia)
        Scanner teclat= new Scanner(System.in);
        
        int i =1;
        System.out.println("Introdueix un nombre: ");
        int n = teclat.nextInt();
        while (i<=n){ 
        System.out.println(n-i+1);
        i = i + 1; 
        } 
    }
}
