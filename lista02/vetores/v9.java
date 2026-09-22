public class v9 {

    public static void main(String[] args) {
        int[] vetor = new int[100];
        int contador = 0;
        int numero = 1;

        // Preenche o vetor até ter 100 números que:
        // - não são múltiplos de 7
        // - não terminam em 7
        while (contador < 100) {
            boolean multiploDe7 = (numero % 7 == 0);
            boolean terminaEm7 = (numero % 10 == 7);

            if (!multiploDe7 && !terminaEm7) {
                vetor[contador] = numero;
                contador++;
            }
            numero++;
        }

        System.out.println("Os 100 números encontrados foram:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
