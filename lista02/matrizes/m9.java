import java.util.Random;

public class m9 {

    // Verifica se um número já foi usado na cartela
    public static boolean existeNaCartela(int[][] cartela, int numero) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (cartela[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] cartela = new int[5][5];
        Random random = new Random();

        // Inicializando com -1 para indicar posições ainda não preenchidas
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cartela[i][j] = -1;
            }
        }

        // Preenchendo a cartela sem números repetidos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero;
                do {
                    numero = random.nextInt(100); // número entre 0 e 99
                } while (existeNaCartela(cartela, numero));
                cartela[i][j] = numero;
            }
        }

        // Exibindo a cartela gerada
        System.out.println("Cartela de bingo gerada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cartela[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
