import java.util.Scanner;

public class v4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[15];

        // Lendo os 15 nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        // Imprimindo em ordem contrária (o último digitado primeiro)
        System.out.println("Nomes em ordem contrária:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
