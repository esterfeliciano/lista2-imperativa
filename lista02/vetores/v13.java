import java.util.Scanner;

public class v13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo n: ");
        int n = sc.nextInt();

        // Construindo o Triângulo de Pascal linha por linha
        for (int linha = 0; linha < n; linha++) {
            int valor = 1;
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print(valor + " ");
                // Fórmula para obter o próximo valor da linha (coeficiente binomial)
                valor = valor * (linha - coluna) / (coluna + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}
