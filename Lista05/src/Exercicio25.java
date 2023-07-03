import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        double[][] matriz = new double[20][5];
        double maiorPreco = 0.0;
        int indexProduto = 0;
        int indexLoja = 0;

        Scanner scanner = new Scanner(System.in);

        // Recebe os preços dos produtos em cada loja
        System.out.println("Digite os preços dos produtos em cada loja:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Loja " + (j + 1) + ", Produto " + (i + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
                if (matriz[i][j] > maiorPreco) {
                    maiorPreco = matriz[i][j];
                    indexProduto = i + 1;
                    indexLoja = j + 1;
                }
            }
        }

        System.out.println("O produto mais caro é o Produto " + indexProduto +
                ", que está na Loja " + indexLoja + ".");

        scanner.close();
    }
}
