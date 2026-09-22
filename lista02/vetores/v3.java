import java.util.Scanner;

public class v3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        // Lendo os 10 valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // Imprimindo os elementos pares (conteúdo par)
        System.out.println("Elementos pares do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
