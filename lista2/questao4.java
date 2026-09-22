import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[15];
        
        System.out.println("Digite 15 nomes:");
        for (int i = 0; i < 15; i++) {
            nomes[i] = scanner.nextLine();
        }
        
        System.out.println("\nNomes em ordem contrária:");
        for (int i = 14; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        scanner.close();
    }
}