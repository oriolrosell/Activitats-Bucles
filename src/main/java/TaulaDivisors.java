import java.util.Scanner;

public class TaulaDivisors {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Entra l'inici dels dividends:");
        int inici =teclat.nextInt();
        System.out.println("Entra el final dels dividends:");
        int finalNum = teclat.nextInt();
        
        for (int num = inici; num <= finalNum; num=num+1) {
            System.out.print(+num+" "   );
        }
        System.out.println();
        for (int divisor = 1; divisor <= 10; divisor=divisor+1) {
            System.out.print( divisor );
            for (int dividend = inici; dividend <= finalNum; dividend=dividend+1) {
                if (dividend % divisor == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}