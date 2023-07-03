import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        int[][] triangulo = new int[n][];
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas do Triângulo de Pascal: ");
        n = scanner.nextInt();

        // Criar e preencher o Triângulo de Pascal
        for (int i = 0; i < n; i++) {
            triangulo[i] = new int[i + 1];
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }

        // Imprimir o Triângulo de Pascal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}