import java.util.Scanner;

public class v5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];

        // Lendo os 20 números
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // Primeiro os elementos com CONTEÚDO ímpar (valor ímpar)
        System.out.println("Elementos com valor ímpar:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i]);
            }
        }

        // Depois os elementos das POSIÇÕES pares (índice par: 0, 2, 4, ...)
        System.out.println("Elementos das posições pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
