package Lista5;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][3];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;
        int linhaMenor = 0;
        int colunaMenor = 0;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica o maior elemento e sua posição
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }

                // Verifica o menor elemento e sua posição
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }

        System.out.println("Maior elemento: " + maior);
        System.out.println("Posição do maior elemento: [" + linhaMaior + "][" + colunaMaior + "]");
        System.out.println("Menor elemento: " + menor);
        System.out.println("Posição do menor elemento: [" + linhaMenor + "][" + colunaMenor + "]");

        scanner.close();
    }
}
