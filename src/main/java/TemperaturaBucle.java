import java.util.Scanner;

// Activitat 01 — Temperatures en bucle
public class TemperaturaBucle {
    
    public static void main(String[] args) {
        // TODO: demana per teclat 5 temperatures en graus Fahrenheit (una per una, amb un bucle)
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9
        Scanner teclat= new Scanner(System.in);
        
        int i =1;
        while (i<=5){ 
        System.out.println("Introdueix una temperatura en fahrenheit");
        double temperaturaF = teclat.nextDouble();
        double temperaturaC=((temperaturaF - 32) * 5) / 9;
        System.out.println("temperaturaC = "+(temperaturaC));
        i = i + 1; 
        }      



     




        
        
    }
}
