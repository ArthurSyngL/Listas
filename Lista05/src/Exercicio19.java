package Lista5;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        double[][] matriz = new double[5][5];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Encontra o maior valor da matriz
        double maiorValor = matriz[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        // Multiplica cada elemento da diagonal principal pelo maior valor
        for (int i = 0; i < 5; i++) {
            matriz[i][i] *= maiorValor;
        }

        // Imprime a matriz resultante após as multiplicações
        System.out.println("Matriz resultante:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
