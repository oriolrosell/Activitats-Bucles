// Activitat 14 — Genera fins al 12

import java.util.Random;

public class GeneraFinsAl12 {
    public static void main(String[] args) {
        // TODO: amb un bucle do-while, genera números aleatoris entre 0 i 15
        //   fins que surti el 12 (compta les iteracions amb un comptador)
        //   Per cada número que NO sigui el 12, mostra:
        //   "El número generat és: <numero>, falten <distància> per assolir l'objectiu."
        //   (la distància és el valor absolut de numero - 12)
        //   Quan surti el 12, no el mostris: acaba mostrant
        //   "Objectiu assolit en: <iteracions> iteracions"

        Random generador= new Random();
         
         int n = -1;
        int interaccions = 0;

        
        while (n != 12) {
            
            n = generador.nextInt(16);

            if (n != 12) {
                interaccions=interaccions+1;
                int distància = Math.abs(n - 12);
                System.out.println("Número generat: " + n + "  Distància al 12: " + distància);
            }
        }

        System.out.println("S'han necessitat " + interaccions + " interaccions per obtenir el 12.");
        
    }
}

