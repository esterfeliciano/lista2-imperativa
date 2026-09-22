import java.util.Scanner;

public class v6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        String[] nomes = new String[n];
        int[] idades = new int[n];

        // Lendo nome e idade de 20 pessoas
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
            sc.nextLine(); // limpar a quebra de linha
        }

        // Calculando a idade média
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + idades[i];
        }
        double media = (double) soma / n;

        System.out.println("Idade média do grupo: " + media);

        // Mostrando quem está acima da média
        System.out.println("Pessoas com idade acima da média:");
        for (int i = 0; i < n; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
