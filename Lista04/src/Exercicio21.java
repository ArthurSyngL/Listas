import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 números inteiros para o vetor B:");
        for (int i = 0; i < 10; i++) {
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("Vetor C (C = A - B):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
