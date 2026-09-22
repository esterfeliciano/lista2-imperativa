import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("\nElementos pares:");
        for (int v : vetor) {
            if (v % 2 == 0) {
                System.out.println(v);
            }
        }
        scanner.close();
    }
}
