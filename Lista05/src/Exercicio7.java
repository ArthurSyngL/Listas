package Lista5;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int[][] matrizM = new int[4][6];
        int[][] matrizN = new int[6][4];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz M com valores fornecidos pelo usuário
        System.out.println("Preencha a matriz M:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrizM[i][j] = scanner.nextInt();
            }
        }

        // Preenche a matriz N com valores fornecidos pelo usuário
        System.out.println("Preencha a matriz N:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrizN[i][j] = scanner.nextInt();
            }
        }

        // Calcula e imprime a soma das linhas de M com as colunas de N
        System.out.println("Soma das linhas de M com as colunas de N:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int soma = 0;
                for (int k = 0; k < 6; k++) {
                    soma += matrizM[i][k] * matrizN[k][j];
                }
                System.out.print(soma + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
