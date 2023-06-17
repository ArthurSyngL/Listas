package Lista5;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        int qtdPares = 0;
        int somaImpares = 0;
        int somaTotal = 0;
        int qtdElementos = matriz.length * matriz[0].length;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    somaImpares += matriz[i][j];
                }
                somaTotal += matriz[i][j];
            }
        }

        double media = (double) somaTotal / qtdElementos;

        System.out.println("Quantidade de elementos pares: " + qtdPares);
        System.out.println("Soma dos elementos ímpares: " + somaImpares);
        System.out.println("Média de todos os elementos: " + media);

        scanner.close();
    }
}
