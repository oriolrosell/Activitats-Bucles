// Activitat 24 — Multiplicar amb sumes successives

import java.util.Scanner;

public class MultiplicarAmbSumes {
    public static void main(String[] args) {
        // TODO: llegeix dos operands enters positius per teclat
        //   multiplica'ls fent servir sumes successives (suma "operand1", "operand2" vegades)
        //   i mostra, en una sola línia, "operand1 + operand1 + ... = resultat"
        //   Per exemple, amb 5 i 4: "5 + 5 + 5 + 5 = 20"
        Scanner teclat =new Scanner(System.in);
        int operador1;
        System.out.println("Introdueix el primer operador");
        operador1=teclat.nextInt();
        int operador2;
        System.out.println("Introdueix el segon operador");
        operador2=teclat.nextInt();
        int resultat=0;
        int i=0;
        while(i<operador2){
            resultat+=operador1;
        System.out.print(operador1);
        if(i<operador2-1)
            System.out.print("+");
        i=i+1;

    }
System.out.print("= " +resultat  +".");

    }
}
