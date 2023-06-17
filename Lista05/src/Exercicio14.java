package Lista5;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        double[][] matriz = new double[12][13];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz 12x13:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Calcula o maior elemento em módulo de cada linha
        double[] maioresElementos = new double[12];
        for (int i = 0; i < 12; i++) {
            double maiorElemento = Math.abs(matriz[i][0]);
            for (int j = 1; j < 13; j++) {
                if (Math.abs(matriz[i][j]) > maiorElemento) {
                    maiorElemento = Math.abs(matriz[i][j]);
                }
            }
            maioresElementos[i] = maiorElemento;
        }

        // Divide cada elemento de cada linha pelo maior elemento em módulo daquela linha
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 13; j++) {
                matriz[i][j] /= maioresElementos[i];
            }
        }

        // Imprime a matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprime a matriz modificada
        System.out.println("Matriz modificada:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
