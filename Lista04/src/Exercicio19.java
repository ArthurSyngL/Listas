import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[50];

        for (int i = 0; i < 50; i++) {
            vetor[i] = (i + 5 * i) % (i + 1);
        }

        // Imprimir o vetor na tela
        for (int i = 0; i < 50; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
