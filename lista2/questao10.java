import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];
        
        System.out.println("Digite 5 elementos para x:");
        for (int i = 0; i < 5; i++) x[i] = scanner.nextInt();
        
        System.out.println("Digite 5 elementos para y:");
        for (int i = 0; i < 5; i++) y[i] = scanner.nextInt();
        
        // a. Soma
        System.out.print("\na. Soma: ");
        for (int i = 0; i < 5; i++) System.out.print((x[i] + y[i]) + " ");
        
        // b. Produto
        System.out.print("\nb. Produto: ");
        for (int i = 0; i < 5; i++) System.out.print((x[i] * y[i]) + " ");
        
        // c. Diferença (x - y)
        System.out.print("\nc. Diferença (x - y): ");
        for (int i = 0; i < 5; i++) {
            boolean existe = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) { existe = true; break; }
            }
            if (!existe) System.out.print(x[i] + " ");
        }
        
        // d. Interseção
        System.out.print("\nd. Interseção: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) { System.out.print(x[i] + " "); break; }
            }
        }
        
        // e. União
        System.out.print("\ne. União: ");
        for (int i = 0; i < 5; i++) System.out.print(x[i] + " ");
        for (int i = 0; i < 5; i++) {
            boolean existe = false;
            for (int j = 0; j < 5; j++) {
                if (y[i] == x[j]) { existe = true; break; }
            }
            if (!existe) System.out.print(y[i] + " ");
        }
        scanner.close();
    }
}