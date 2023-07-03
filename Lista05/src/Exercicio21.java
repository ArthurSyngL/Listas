
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][10];
        int[] somaColunas = new int[10];

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores da matriz 6x10:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Soma as colunas individualmente e acumula as somas na 7ª linha da matriz
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 6; i++) {
                somaColunas[j] += matriz[i][j];
            }
            matriz[6][j] = somaColunas[j];
        }

        // Mostra o resultado de cada coluna
        System.out.println("Resultado de cada coluna:");
        for (int j = 0; j < 10; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }

        scanner.close();
    }
}
