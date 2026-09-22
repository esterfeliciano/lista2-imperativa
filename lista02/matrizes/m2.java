public class m2 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Preenchendo: diagonal principal com 1, o resto com 0
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz gerada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
