package Lista5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][4];
        int[] quantidade = new int[2];
        int somaPares = 0;
        int countPares = 0;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica a quantidade de elementos entre 12 e 20 em cada linha
                if (matriz[i][j] >= 12 && matriz[i][j] <= 20) {
                    quantidade[i]++;
                }

                // Calcula a soma dos elementos pares
                if (matriz[i][j] % 2 == 0) {
                    somaPares += matriz[i][j];
                    countPares++;
                }
            }
        }

        // Imprime a quantidade de elementos entre 12 e 20 em cada linha
        for (int i = 0; i < 2; i++) {
            System.out.println("Quantidade de elementos entre 12 e 20 na linha " + i + ": " + quantidade[i]);
        }

        // Calcula e imprime a média dos elementos pares
        double mediaPares = (double) somaPares / countPares;
        System.out.println("Média dos elementos pares da matriz: " + mediaPares);

        scanner.close();
    }
}
