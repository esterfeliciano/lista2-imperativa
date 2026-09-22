import java.util.Scanner;

public class v12 {

    // Verifica se um valor já existe dentro das posições já preenchidas do vetor
    public static boolean existeNoVetor(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] vetor = new int[n];

        int i = 0;
        while (i < n) {
            System.out.print("Digite um número (diferente dos já digitados): ");
            int numero = sc.nextInt();

            if (existeNoVetor(vetor, i, numero)) {
                System.out.println("Esse número já foi digitado! Digite outro.");
            } else {
                vetor[i] = numero;
                i++;
            }
        }

        System.out.println("Vetor final digitado:");
        for (int j = 0; j < vetor.length; j++) {
            System.out.println(vetor[j]);
        }

        sc.close();
    }
}
