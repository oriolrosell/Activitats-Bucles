
import java.util.Scanner;

// Activitat 17 — Gran i petit, apropant-se
public class GranIPetit {
    public static void main(String[] args) {
        // TODO: llegeix dos números per teclat: gran i petit
        //   amb un bucle while, mentre gran sigui més gran que petit:
        //     mostra "Gran = <gran>   Petit = <petit>"
        //     divideix gran entre 2 i multiplica petit per 2
        Scanner teclat= new Scanner(System.in);
        System.out.println("Introdueix el número Gran");
        int númeroGran=teclat.nextInt();
        System.out.println("Introdueix el número petit");
        int númeroPetit=teclat.nextInt();
        while(númeroGran>=númeroPetit){
            System.out.println("Gran = " + númeroGran + "   Petit = " + númeroPetit);

        
            númeroGran = númeroGran / 2;
            númeroPetit = númeroPetit * 2;  
            
            
        

       
        }
    }
}
