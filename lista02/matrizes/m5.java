import java.util.Scanner;

public class m5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os 25 valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o valor X a ser procurado: ");
        int x = sc.nextInt();

        // Procurando o valor X na matriz
        boolean encontrado = false;
        int linhaEncontrada = -1;
        int colunaEncontrada = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    encontrado = true;
                    linhaEncontrada = i;
                    colunaEncontrada = j;
                }
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado na linha " + linhaEncontrada + ", coluna " + colunaEncontrada);
        } else {
            System.out.println("Não encontrado");
        }

        sc.close();
    }
}
