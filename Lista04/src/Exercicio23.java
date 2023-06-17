import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        double[] vetor1 = new double[5];
        double[] vetor2 = new double[5];
        double produtoEscalar = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números reais para o vetor 1:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = scanner.nextDouble();
        }

        System.out.println("Digite 5 números reais para o vetor 2:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        System.out.println("Vetor 1:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println("\nVetor 2:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor2[i] + " ");
        }

        System.out.println("\nProduto escalar: " + produtoEscalar);
    }
}
