import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int count = 0;
        
        while (count < 10) {
            System.out.print("Digite o " + (count + 1) + "º número diferente: ");
            int num = scanner.nextInt();
            
            boolean repetido = false;
            for (int i = 0; i < count; i++) {
                if (vetor[i] == num) {
                    repetido = true;
                    break;
                }
            }
            
            if (repetido) {
                System.out.println("Número já digitado! Tente outro.");
            } else {
                vetor[count] = num;
                count++;
            }
        }
        
        System.out.println("\nVetor final:");
        for (int v : vetor) System.out.print(v + " ");
        scanner.close();
    }
}