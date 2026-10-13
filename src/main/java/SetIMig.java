import java.util.Random;
import java.util.Scanner;
// Activitat 29 — El set i mig
public class SetIMig {
    public static void main(String[] args) {
        // TODO: demana l'aposta per teclat
        //   amb un bucle while, la condició del qual combini "total < 7.5" I
        //   "el jugador vol seguir" (condició d'acabament complexa, sense break):
        //     genera una carta aleatòria de l'1 al 10 (8=sota, 9=cavall, 10=rei,
        //     totes valen 0.5; de l'1 al 7 valen el seu número)
        //     suma el seu valor al total i mostra la carta i el total
        //     si el total encara és menor que 7.5, pregunta si vol una altra carta
        //     (si diu que no, deixa de voler seguir)
        //   Quan acabi el bucle, mostra:
        //     "Has Perdut!!!!" si el total supera 7.5
        //     "Has Guanyat <2 x aposta> euros." si el total és exactament 7.5
        //     "El jugador es planta!!!" en cas contrari
        Scanner teclat=new Scanner(System.in);
        Random generador= new Random();
        System.out.print("Introdueix la teva aposta en euros: ");
        double aposta = teclat.nextDouble();

        double total = 0.0;
        boolean volSeguir = true;

    
        while (total < 7.5 && volSeguir) {
            
            int carta = generador.nextInt(10) + 1;
            
            
            double valorCarta;
            if (carta >= 8) {
                valorCarta = 0.5;
            } else {
                valorCarta = carta;
            }

          
            total += valorCarta;

            
            System.out.println("T'ha tocat la carta " + carta + " (valor: " + valorCarta + "). Total: " + total);

            
            if (total < 7.5) {
                System.out.print("Vols una altra carta? (s/n): ");
                char resposta = teclat.next().toLowerCase().charAt(0);
                
                if (resposta != 's') {
                    volSeguir = false;
                }
            }
        }

        if (total > 7.5) {
            System.out.println("Has Perdut!!!!");
        } else if (total == 7.5) {
            System.out.println("Has Guanyat " + (2 * aposta) + " euros.");
        } else {
            System.out.println("El jugador es planta!!!");
        }


    }
}
