// Activitat 26 — Mitjana, nota més gran i nota més petita

import java.util.Scanner;

public class NotesMitjanaMaxMin {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) llegeix la primera nota i inicialitza amb ella suma, notaMajor i notaMenor
        //   3) amb un bucle, per a la resta d'alumnes: llegeix la nota, acumula-la a
        //      suma, i actualitza notaMajor/notaMenor si cal (comparant-la)
        //   4) calcula la mitjana (suma / N)
        //   5) mostra la mitjana, la nota més gran i la nota més petita
             Scanner teclat= new Scanner(System.in);
    
        System.out.print("Introdueix el nombre d'alumnes: ");
        int n = teclat.nextInt();

        System.out.print("Introdueix la nota de l'alumne 1: ");
        double primeraNota = teclat.nextDouble();

        double suma = primeraNota;
        double mésGran = primeraNota;
        double mésPetit = primeraNota;

        int i = 2;
        while (i <= n) {
            System.out.print("Introdueix la nota de l'alumne " + i + ": ");
            double nota = teclat.nextDouble();

            suma = suma + nota;

            if (nota > mésGran) {
                mésGran = nota;
            }
            if (nota < mésPetit) {
                mésPetit = nota;
            }

            i = i + 1;  
        }

        double mitjana = suma / n;

        System.out.println("La mitjana de les notes és: " + mitjana);
        System.out.println("La nota més gran és: " + mésGran);
        System.out.println("La nota més petita és: " + mésPetit);

        
    }
}
