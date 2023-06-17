package Lista5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[][] matriz = new int[20][10];
        int[] somaColunas = new int[10];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma de cada coluna e armazena em um vetor
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 20; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        // Multiplica cada elemento da matriz pela soma da coluna correspondente
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] *= somaColunas[j];
            }
        }

        // Imprime a matriz resultante
        for (int i = 0; i < 20; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        scanner.close();
    }
}
