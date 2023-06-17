package Lista5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        int quantidade = 0;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Conta a quantidade de elementos entre 15 e 20
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] >= 15 && matriz[i][j] <= 20) {
                    quantidade++;
                }
            }
        }

        System.out.println("A quantidade de elementos entre 15 e 20 é: " + quantidade);

        scanner.close();
    }
}
