import java.util.Scanner;

public class v10 {

    // Verifica se um valor existe dentro de um vetor (só olha as posições já usadas)
    public static boolean existeNoVetor(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] x = new int[n];
        int[] y = new int[n];

        System.out.println("Digite os " + n + " valores do vetor x:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Digite os " + n + " valores do vetor y:");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        // a. Soma
        int[] soma = new int[n];
        for (int i = 0; i < n; i++) {
            soma[i] = x[i] + y[i];
        }

        // b. Produto
        int[] produto = new int[n];
        for (int i = 0; i < n; i++) {
            produto[i] = x[i] * y[i];
        }

        // c. Diferença (elementos de x que não existem em y)
        int[] diferenca = new int[n];
        int qtdDiferenca = 0;
        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(y, n, x[i])) {
                diferenca[qtdDiferenca] = x[i];
                qtdDiferenca++;
            }
        }

        // d. Interseção (elementos que aparecem nos dois vetores)
        int[] intersecao = new int[n];
        int qtdIntersecao = 0;
        for (int i = 0; i < n; i++) {
            if (existeNoVetor(y, n, x[i])) {
                intersecao[qtdIntersecao] = x[i];
                qtdIntersecao++;
            }
        }

        // e. União (todos de x, mais os de y que não estão em x)
        int[] uniao = new int[2 * n];
        int qtdUniao = 0;
        for (int i = 0; i < n; i++) {
            uniao[qtdUniao] = x[i];
            qtdUniao++;
        }
        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(x, n, y[i])) {
                uniao[qtdUniao] = y[i];
                qtdUniao++;
            }
        }

        // Mostrando os resultados
        System.out.print("Soma: ");
        for (int i = 0; i < n; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println();

        System.out.print("Produto: ");
        for (int i = 0; i < n; i++) {
            System.out.print(produto[i] + " ");
        }
        System.out.println();

        System.out.print("Diferença: ");
        for (int i = 0; i < qtdDiferenca; i++) {
            System.out.print(diferenca[i] + " ");
        }
        System.out.println();

        System.out.print("Interseção: ");
        for (int i = 0; i < qtdIntersecao; i++) {
            System.out.print(intersecao[i] + " ");
        }
        System.out.println();

        System.out.print("União: ");
        for (int i = 0; i < qtdUniao; i++) {
            System.out.print(uniao[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
