import java.util.Scanner;

public class m7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os 9 valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaAcima = 0;
        int somaAbaixo = 0;
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    somaPrincipal = somaPrincipal + matriz[i][j];
                }
                if (i + j == 3 - 1) {
                    somaSecundaria = somaSecundaria + matriz[i][j];
                }
                if (i < j) {
                    somaAcima = somaAcima + matriz[i][j];
                }
                if (i > j) {
                    somaAbaixo = somaAbaixo + matriz[i][j];
                }
            }
        }

        System.out.println("Soma acima da diagonal principal: " + somaAcima);
        System.out.println("Soma abaixo da diagonal principal: " + somaAbaixo);
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        sc.close();
    }
}
