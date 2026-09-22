public class m6 {

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // Gerando os valores conforme as regras do enunciado
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    matriz[i][j] = 3 * i * i - 1;
                } else { // i > j
                    matriz[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz gerada:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
