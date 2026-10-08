import java.util.Scanner;
// Activitat 22 — Mitjana de notes
public class MitjanaNotes {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) amb un bucle, demana la nota de cada alumne i vés acumulant la suma
        //      en una variable (suma = suma + nota)
        //   3) calcula la mitjana dividint la suma entre N
        //   4) mostra: "La mitjana de les notes és: <mitjana>"
        Scanner teclat= new Scanner(System.in);
        System.out.println("Introdueix el nombre d'alumnes: ");
        int n = teclat.nextInt();
        int i = 1;
        double suma = 0;
        while (i <= n) {
            System.out.println("Introdueix la nota de l'alumne " + i + ": ");
            double nota = teclat.nextDouble();
            suma = suma + nota;
            i = i + 1;  
        }
        double mitjana = suma / n;
        System.out.println("La mitjana de les notes és: " + mitjana);
    }
}
