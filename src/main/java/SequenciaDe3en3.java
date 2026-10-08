// Activitat 15 — Seqüència de 3 en 3, amb final per teclat

import java.util.Scanner;

public class SequenciaDe3en3 {
    public static void main(String[] args) {
        // TODO: demana per teclat el final de la seqüència (un enter)
        //   i mostra, en una sola línia i separats per ", ",
        //   els valors 2, 5, 8, 11, 14... (de 3 en 3) mentre no superin aquest final
        Scanner teclat = new Scanner(System.in);

        System.out.println("Quin ha de ser el final de la seqüència?");
        int max = teclat.nextInt();

        int num = 2;
        while (num <= max) {
            System.out.print(num);
            if (num + 3 <= max) {
                System.out.print(", ");
            }
            
            num += 3;
        }
        
        
    }
}
