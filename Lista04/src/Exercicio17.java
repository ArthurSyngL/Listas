import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        System.out.println("Valores do vetor após zerar os negativos:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }
}
