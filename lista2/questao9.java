public class q9 {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        int count = 0;
        int num = 1;
        
        while (count < 100) {
            if (num % 7 != 0 || num % 10 == 7) {
                vetor[count] = num;
                count++;
            }
            num++;
        }
        
        System.out.println("Vetor preenchido:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetor[i] + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }
}