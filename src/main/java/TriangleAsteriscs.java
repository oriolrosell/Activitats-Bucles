// Activitat 34 — Triangle d'asteriscs (bucles encaixats)
public class TriangleAsteriscs {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 33, però mostrant asteriscs en lloc de
        //   números: "*", "* *", "* * *", ... fins a 9 asteriscs a l'última fila
        for (int fila = 1; fila <= 9; fila=fila+1) {
           
            for (int columna = 1; columna <= fila; columna=columna+1) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}