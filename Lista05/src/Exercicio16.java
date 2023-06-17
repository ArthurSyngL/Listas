package Lista5;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
                if (i + j == 2) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        // Imprime a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprime a soma dos elementos da diagonal principal e da diagonal secundária
        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);

        scanner.close();
    }
}
