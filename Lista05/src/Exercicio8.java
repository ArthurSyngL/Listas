package Lista5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[][] matrizA = new int[3][8];
        int[][] matrizB = new int[3][8];
        int[][] matrizSoma = new int[3][8];
        int[][] matrizDiferenca = new int[3][8];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz A com valores fornecidos pelo usuário
        System.out.println("Preencha a matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Preenche a matriz B com valores fornecidos pelo usuário
        System.out.println("Preencha a matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma das duas matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Calcula a diferença das duas matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                matrizDiferenca[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        // Imprime a soma das duas matrizes
        System.out.println("Soma das duas matrizes:");
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(matrizSoma[i]));
        }

        // Imprime a diferença das duas matrizes
        System.out.println("Diferença das duas matrizes:");
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(matrizDiferenca[i]));
        }

        scanner.close();
    }
}
