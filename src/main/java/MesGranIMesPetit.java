import java.util.Scanner;
public class MesGranIMesPetit {
    public static void main(String[] args) {
        // TODO: llegeix 20 números per teclat (amb un bucle)
        //   vés comparant cada número llegit amb el "més gran" i el "més petit"
        //   que tinguis fins ara (les primeres variables s'inicialitzen amb el
        //   primer número llegit) i actualitza'ls quan calgui
        //   Mostra: "El número més gran és: <mesGran> i el més petit: <mesPetit>"
        Scanner teclat= new Scanner(System.in);
        System.out.println("Introdueix un número");
        int número=teclat.nextInt();
        int mésGran=número;
        int mésPetit=número;
        int i=1;
        while(i<20){
            System.out.println("Introdueix un número");
            número=teclat.nextInt();
            if(número>mésGran){
                mésGran=número;
            }
            if(número<mésPetit){
                mésPetit=número;
            }
            i=i+1;
        }
        System.out.println("El número més gran és: " + mésGran + " i el més petit: " + mésPetit);   

    }
}
