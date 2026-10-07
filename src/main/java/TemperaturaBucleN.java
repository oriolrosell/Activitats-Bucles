// Activitat 04 — Temperatures en bucle (quantitat per teclat)

import java.util.Scanner;

public class TemperaturaBucleN {
    public static void main(String[] args) {
        // TODO: demana quantes temperatures (N) vol convertir l'usuari
        //   i després, amb un bucle, llegeix N temperatures en Fahrenheit
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9
         Scanner teclat= new Scanner(System.in);
        
        int i =0;
        System.out.println("Introdueix el nombre de temperatures a convertir:");
        int n = teclat.nextInt();
        while (i<n){ 
        System.out.println("Introdueix una temperatura en fahrenheit");
        double temperaturaF = teclat.nextDouble();
        double temperaturaC=((temperaturaF - 32) * 5) / 9;
        System.out.println("temperaturaC = "+(temperaturaC));
        i = i + 1; 
        } 
    }
}
