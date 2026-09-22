import java.util.Scanner;

public class m14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasDeAula = 30;
        int limiteFaltas = 10;

        System.out.print("Digite o número N de alunos: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpar a quebra de linha

        String[] nomes = new String[n];
        // matriz de presenças: 'P' ou 'F' para cada aluno em cada dia
        char[][] presencas = new char[n][diasDeAula];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            System.out.println("Digite a presença (P ou F) para cada um dos " + diasDeAula + " dias:");
            for (int dia = 0; dia < diasDeAula; dia++) {
                String resposta = sc.nextLine();
                presencas[i][dia] = resposta.charAt(0);
            }
        }

        // Verificando reprovação por falta e mostrando os dias de falta
        System.out.println("Alunos reprovados por falta:");
        for (int i = 0; i < n; i++) {
            int totalFaltas = 0;
            for (int dia = 0; dia < diasDeAula; dia++) {
                if (presencas[i][dia] == 'F') {
                    totalFaltas++;
                }
            }

            if (totalFaltas > limiteFaltas) {
                System.out.print(nomes[i] + " - dias: ");
                for (int dia = 0; dia < diasDeAula; dia++) {
                    if (presencas[i][dia] == 'F') {
                        // dia + 1 para mostrar o dia começando em 1, e não em 0
                        System.out.print((dia + 1) + " ");
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
