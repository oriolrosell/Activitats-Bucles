// Activitat 18 — Nombre de xifres

import java.util.Scanner;

public class NombreDeXifres {
    public static void main(String[] args) {
        // TODO: llegeix un número enter positiu per teclat
        //   divideix-lo successivament entre 10 (prenent la part sencera)
        //   fins obtenir un quocient 0, comptant les divisions fetes amb un comptador
        //   Mostra: "El número <numero> té <xifres> xifres."
        Scanner teclat= new Scanner(System.in);
        System.out.println("Introdueix el número");
        int número_Incial=teclat.nextInt();
        int número=número_Incial;
        int xifres=0;
        while(número>0){
            número=número/10;
            xifres++;
        }
        System.out.println("El número " + número_Incial + " té " + xifres + " xifres.");
    }
}

