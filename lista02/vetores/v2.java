import java.util.Scanner;

public class v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[6];

        // Lendo os 6 valores
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }

        // Mostrando os valores lidos
        System.out.println("Valores lidos:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        sc.close();
    }
}
