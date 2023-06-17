package Lista5;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int[][] matrizA = new int[4][3];
        int[][] matrizB = new int[4][3];
        int[][] matrizSoma = new int[4][3];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz A com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz A 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Preenche a matriz B com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz B 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Calcula a matriz soma
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Imprime a matriz A
        System.out.println("Matriz A:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprime a matriz B
        System.out.println("Matriz B:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprime a matriz soma
        System.out.println("Matriz soma:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
