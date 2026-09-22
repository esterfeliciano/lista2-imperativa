import java.util.Scanner;

// Observação: o enunciado fala em criar uma "terceira matriz 3x3", mas como
// as matrizes de entrada são 2x2, a matriz resultado também foi feita 2x2.
public class m12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrizA = new double[2][2];
        double[][] matrizB = new double[2][2];

        System.out.println("Digite os 4 valores da primeira matriz (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizA[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Digite os 4 valores da segunda matriz (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizB[i][j] = sc.nextDouble();
            }
        }

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMenu:");
            System.out.println("1 - Somar as duas matrizes");
            System.out.println("2 - Subtrair a primeira matriz da segunda");
            System.out.println("3 - Adicionar uma constante às duas matrizes");
            System.out.println("4 - Imprimir as matrizes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                // Criando a matriz resultado da soma (2x2)
                double[][] resultado = new double[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                    }
                }
                System.out.println("Resultado da soma:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(resultado[i][j] + "\t");
                    }
                    System.out.println();
                }

            } else if (opcao == 2) {
                // Criando a matriz resultado da subtração (B - A)
                double[][] resultado = new double[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        resultado[i][j] = matrizB[i][j] - matrizA[i][j];
                    }
                }
                System.out.println("Resultado da subtração (segunda - primeira):");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(resultado[i][j] + "\t");
                    }
                    System.out.println();
                }

            } else if (opcao == 3) {
                System.out.print("Digite a constante a ser somada: ");
                double constante = sc.nextDouble();

                // Somando a constante nas próprias matrizes
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        matrizA[i][j] = matrizA[i][j] + constante;
                        matrizB[i][j] = matrizB[i][j] + constante;
                    }
                }
                System.out.println("Constante adicionada com sucesso!");

            } else if (opcao == 4) {
                System.out.println("Primeira matriz:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(matrizA[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Segunda matriz:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(matrizB[i][j] + "\t");
                    }
                    System.out.println();
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
