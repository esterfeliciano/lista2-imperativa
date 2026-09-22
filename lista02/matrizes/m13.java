import java.util.Scanner;

public class m13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] teatro = new int[10][10];

        // Inicializando todas as poltronas como vazias (-1)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = -1;
            }
        }

        System.out.print("Digite o número N de tentativas de compra: ");
        int n = sc.nextInt();

        for (int venda = 0; venda < n; venda++) {
            System.out.print("Digite a fila: ");
            int fila = sc.nextInt();
            System.out.print("Digite a poltrona: ");
            int poltrona = sc.nextInt();

            if (teatro[fila][poltrona] == -1) {
                teatro[fila][poltrona] = 1;
            } else {
                System.out.println("Poltrona já foi vendida");
            }
        }

        // Imprimindo a matriz final
        System.out.println("Situação final do teatro:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(teatro[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
