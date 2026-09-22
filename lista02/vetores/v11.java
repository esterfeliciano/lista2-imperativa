import java.util.Scanner;

public class v11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[] V = new double[n];

        System.out.println("Digite os " + n + " números:");
        for (int i = 0; i < n; i++) {
            V[i] = sc.nextDouble();
        }

        // Calculando a média (m)
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + V[i];
        }
        double m = soma / n;

        // Calculando a soma dos quadrados das diferenças em relação à média
        double somaQuadrados = 0;
        for (int i = 0; i < n; i++) {
            somaQuadrados = somaQuadrados + (V[i] - m) * (V[i] - m);
        }

        // Variância e desvio padrão
        double variancia = somaQuadrados / n;
        double desvioPadrao = Math.sqrt(variancia);

        System.out.println("Média: " + m);
        System.out.println("Desvio padrão: " + desvioPadrao);

        sc.close();
    }
}
