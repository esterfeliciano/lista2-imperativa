import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];
        int somaIdades = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Idade de " + nomes[i] + ": ");
            idades[i] = scanner.nextInt();
            scanner.nextLine(); // limpar buffer
            somaIdades += idades[i];
        }
        
        double media = (double) somaIdades / 20;
        System.out.println("\nIdade média do grupo: " + media);
        System.out.println("Pessoas com idade acima da média:");
        
        for (int i = 0; i < 20; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i] + " (" + idades[i] + " anos)");
            }
        }
        scanner.close();
    }
}