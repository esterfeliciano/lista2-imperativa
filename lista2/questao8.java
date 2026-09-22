import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[20];
        
        System.out.println("Digite 10 valores para o vetor 1:");
        for (int i = 0; i < 10; i++) v1[i] = scanner.nextInt();
        
        System.out.println("Digite 10 valores para o vetor 2:");
        for (int i = 0; i < 10; i++) v2[i] = scanner.nextInt();
        
        for (int i = 0; i < 10; i++) {
            v3[2 * i] = v1[i];     // Posições pares
            v3[2 * i + 1] = v2[i]; // Posições ímpares
        }
        
        System.out.println("\nVetor resultante:");
        for (int val : v3) {
            System.out.print(val + " ");
        }
        scanner.close();
    }
}