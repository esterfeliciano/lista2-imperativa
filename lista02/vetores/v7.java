import java.util.Scanner;

public class v7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        int[] v3 = new int[2 * n];

        // Lendo o primeiro vetor
        System.out.println("Digite os " + n + " valores do primeiro vetor:");
        for (int i = 0; i < n; i++) {
            v1[i] = sc.nextInt();
        }

        // Lendo o segundo vetor
        System.out.println("Digite os " + n + " valores do segundo vetor:");
        for (int i = 0; i < n; i++) {
            v2[i] = sc.nextInt();
        }

        // Intercalando os elementos dos dois vetores
        int pos = 0;
        for (int i = 0; i < n; i++) {
            v3[pos] = v1[i];
            pos++;
            v3[pos] = v2[i];
            pos++;
        }

        // Mostrando o vetor resultante
        System.out.println("Vetor intercalado:");
        for (int i = 0; i < v3.length; i++) {
            System.out.println(v3[i]);
        }

        sc.close();
    }
}
