import java.util.Scanner;

public class v8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        int[] resultado = new int[n];

        System.out.println("Digite os " + n + " valores do primeiro vetor:");
        for (int i = 0; i < n; i++) {
            v1[i] = sc.nextInt();
        }

        System.out.println("Digite os " + n + " valores do segundo vetor:");
        for (int i = 0; i < n; i++) {
            v2[i] = sc.nextInt();
        }

        // Posições pares (0, 2, 4...) recebem do primeiro vetor
        // Posições ímpares (1, 3, 5...) recebem do segundo vetor
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                resultado[i] = v1[i];
            } else {
                resultado[i] = v2[i];
            }
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }

        sc.close();
    }
}
