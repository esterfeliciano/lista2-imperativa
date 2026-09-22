import java.util.Scanner;

public class m10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] somaColunas = new int[3];

        System.out.println("Digite os 9 valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Somando os valores de cada coluna
        for (int j = 0; j < 3; j++) {
            int soma = 0;
            for (int i = 0; i < 3; i++) {
                soma = soma + matriz[i][j];
            }
            somaColunas[j] = soma;
        }

        System.out.println("Vetor com a soma das colunas:");
        for (int j = 0; j < 3; j++) {
            System.out.println(somaColunas[j]);
        }

        sc.close();
    }
}
