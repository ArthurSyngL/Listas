import java.util.Arrays;
import java.util.Scanner;
public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[10];

        System.out.println("Digite 10 números reais:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        // Ordenação do vetor usando o algoritmo Bubble Sort
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    double temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado:");
        System.out.println(Arrays.toString(vetor));
    }
}
