import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[20];
        int[] v2 = new int[20];
        int[] v3 = new int[40];
        
        System.out.println("Digite 20 números para o primeiro vetor:");
        for (int i = 0; i < 20; i++) v1[i] = scanner.nextInt();
        
        System.out.println("Digite 20 números para o segundo vetor:");
        for (int i = 0; i < 20; i++) v2[i] = scanner.nextInt();
        
        int j = 0;
        for (int i = 0; i < 20; i++) {
            v3[j++] = v1[i];
            v3[j++] = v2[i];
        }
        
        System.out.println("\nVetor intercalado (v3):");
        for (int val : v3) {
            System.out.print(val + " ");
        }
        scanner.close();
    }
}