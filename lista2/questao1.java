public class q1 {
    public static void main(String[] args) {
        // a. Atribuir valores ao vetor A
        int[] A = {1, 0, 5, -2, -5, 7};
        
        // b. Soma entre A[0], A[1] e A[5]
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma: " + soma);
        
        // c. Modificar a posição 4 para 100
        A[4] = 100;
        
        // d. Mostrar cada valor do vetor em uma linha
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}