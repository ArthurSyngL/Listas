package Lista5;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        double[][] matriz = new double[3][3];
        double numero;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Solicita o número para multiplicação
        System.out.print("Digite um número para multiplicar a matriz: ");
        numero = scanner.nextDouble();

        // Multiplica cada elemento da matriz pelo número digitado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= numero;
            }
        }

        // Imprime a matriz resultante
        System.out.println("Matriz resultante da multiplicação:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
