package Lista5;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] < 5 || matriz[i][j] > 15) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de elementos fora do intervalo (5, 15]: " + contador);

        scanner.close();
    }
}
