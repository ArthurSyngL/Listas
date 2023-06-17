package Lista5;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        int[][] matrizA = new int[3][4];
        int[][] matrizB = new int[4][2];
        int[][] matrizProduto = new int[3][2];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz A com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz A 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Preenche a matriz B com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz B 4x2:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Calcula a matriz produto
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 4; k++) {
                    matrizProduto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Imprime a matriz A
        System.out.println("Matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprime a matriz B
        System.out.println("Matriz B:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprime a matriz produto
        System.out.println("Matriz produto:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizProduto[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
