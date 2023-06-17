package Lista5;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        int[] somaColunas = new int[5];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz 4x5:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                somaColunas[j] += matriz[i][j];
            }
        }

        // Calcula a quantidade de elementos maiores que dez
        for (int j = 0; j < 5; j++) {
            if (somaColunas[j] > 10) {
                count++;
            }
        }

        if (count > 0) {
            int[] vetor = new int[count];
            int index = 0;

            // Preenche o vetor com as somas maiores que dez
            for (int j = 0; j < 5; j++) {
                if (somaColunas[j] > 10) {
                    vetor[index] = somaColunas[j];
                    index++;
                }
            }

            // Mostra os elementos do vetor maiores que dez
            System.out.println("Elementos do vetor maiores que dez:");
            for (int i = 0; i < count; i++) {
                System.out.println(vetor[i]);
            }
        } else {
            System.out.println("Não existem elementos maiores que dez.");
        }

        scanner.close();
    }
}
