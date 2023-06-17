import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite um número X:");
        int x = scanner.nextInt();

        System.out.println("Múltiplos de " + x + " encontrados:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % x == 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
