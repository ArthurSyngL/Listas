package Lista5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[] somasLinhas = new int[5];
        int[] somasColunas = new int[5];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                somasLinhas[i] += matriz[i][j];
                somasColunas[j] += matriz[i][j];
            }
        }

        // Imprime a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprime as somas das linhas
        System.out.println("Somas das linhas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + i + ": " + somasLinhas[i]);
        }

        // Imprime as somas das colunas
        System.out.println("Somas das colunas:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Coluna " + j + ": " + somasColunas[j]);
        }

        // Imprime a média das somas das linhas e das somas das colunas
        double mediaLinhas = Arrays.stream(somasLinhas).average().orElse(0);
        double mediaColunas = Arrays.stream(somasColunas).average().orElse(0);

        System.out.println("Média das somas das linhas: " + mediaLinhas);
        System.out.println("Média das somas das colunas: " + mediaColunas);

        scanner.close();
    }
}
