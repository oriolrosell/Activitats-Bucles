import java.util.Scanner;

public class GeneradorTaulaHTML {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Entra el número de files:");
        int files = teclat.nextInt();

        System.out.println("Entra el número de columnes:");
        int columnes = teclat.nextInt();

        System.out.println("<table border='1'>");
        for (int i = 1; i <= files; i=i+1) {
            System.out.println("    <tr>");
            for (int j = 1; j <= columnes; j=j+1) {
                System.out.println("        <td>" + i + "," + j + "</td>");
            }
            System.out.println("    </tr>");
        }
        System.out.println("</table>");


    }
}