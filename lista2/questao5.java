import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        
        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\nElementos ímpares:");
        for (int n : numeros) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }
        
        System.out.println("\nElementos das posições pares:");
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        scanner.close();
    }
}