import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];
        
        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < 6; i++) {
            valores[i] = scanner.nextInt();
        }
        
        System.out.println("\nValores lidos:");
        for (int v : valores) {
            System.out.println(v);
        }
        scanner.close();
    }
}