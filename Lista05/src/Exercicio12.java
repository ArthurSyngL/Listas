package Lista5;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][4];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz 6x4:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcula o maior elemento de cada linha e multiplica a linha pelo maior elemento
        for (int i = 0; i < 6; i++) {
            int maiorElemento = matriz[i][0];
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= maiorElemento;
            }
        }

        // Imprime a matriz resultante
        System.out.println("Matriz resultante:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
