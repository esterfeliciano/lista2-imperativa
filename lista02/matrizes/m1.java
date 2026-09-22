import java.util.Scanner;

public class m1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite os 16 valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Contando valores maiores que 10
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > 10) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de valores maiores que 10: " + contador);

        sc.close();
    }
}
