public class m3 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Preenchendo com o produto da linha pela coluna
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz gerada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
