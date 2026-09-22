import java.util.Scanner;

public class v1 {

    public static void main(String[] args) {
        int[] A = new int[6];

        // a. Atribuindo os valores ao vetor
        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;

        // b. Soma entre as posições A[0], A[1] e A[5]
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma de A[0] + A[1] + A[5] = " + soma);

        // c. Modificando a posição 4
        A[4] = 100;

        // d. Mostrando cada valor do vetor, um por linha
        System.out.println("Valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
