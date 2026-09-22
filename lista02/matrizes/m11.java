import java.util.Scanner;

public class m11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdAlunos = 5;
        // Colunas: 0 = matrícula, 1 = média das provas, 2 = média dos trabalhos, 3 = nota final
        int[][] matriz = new int[qtdAlunos][4];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");

            System.out.print("Número de matrícula: ");
            matriz[i][0] = sc.nextInt();

            System.out.print("Média das provas: ");
            matriz[i][1] = sc.nextInt();

            System.out.print("Média dos trabalhos: ");
            matriz[i][2] = sc.nextInt();

            // Nota final = soma das duas médias
            matriz[i][3] = matriz[i][1] + matriz[i][2];
        }

        // Encontrando o aluno com a maior nota final
        int maiorNota = matriz[0][3];
        int matriculaMaiorNota = matriz[0][0];
        int somaNotas = 0;

        for (int i = 0; i < qtdAlunos; i++) {
            somaNotas = somaNotas + matriz[i][3];
            if (matriz[i][3] > maiorNota) {
                maiorNota = matriz[i][3];
                matriculaMaiorNota = matriz[i][0];
            }
        }

        double mediaNotas = (double) somaNotas / qtdAlunos;

        System.out.println("Matrícula do aluno com maior nota final: " + matriculaMaiorNota);
        System.out.println("Média aritmética das notas finais: " + mediaNotas);

        sc.close();
    }
}
