// Activitat 11 — Cara o creu, 100 llançaments

import java.util.Random;

public class CaraCreu {
    public static void main(String[] args) {
        // TODO: simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb una variable que
        //   s'incrementi ella mateixa d'un en un (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"
         Random generador= new Random();
         
         int creus = 0;
        
        int i = 1;
        while (i <= 100) {
            int numero = generador.nextInt(2); 
            
            if (numero == 1) {
                creus++; 
            }
            i= i + 1;
        }
        int cares = 100 - creus;
        System.out.println("Cares: " + cares);
        System.out.println("Creus: " + creus);
    }
    }
