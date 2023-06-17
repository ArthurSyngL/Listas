package Lista5;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma dos elementos da matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
        }

        // Imprime a soma
        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
