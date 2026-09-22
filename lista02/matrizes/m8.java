import java.util.Random;

public class m8 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] triangular = new int[4][4];
        Random random = new Random();

        // Gerando a matriz com valores entre 1 e 20
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(20) + 1; // gera de 1 a 20
            }
        }

        // Copiando e zerando os valores acima da diagonal principal
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j > i) {
                    triangular[i][j] = 0;
                } else {
                    triangular[i][j] = matriz[i][j];
                }
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz triangular inferior:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(triangular[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
