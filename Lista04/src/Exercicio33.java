import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        int tamanho = 15;
        int[] vetor = new int[tamanho];
        int[] vetorCompacto;

        Scanner sc = new Scanner(System.in);

        // Leitura do vetor
        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sc.nextInt();
        }

        // Compactação do vetor
        int numZeros = 0;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == 0) {
                numZeros++;
            } else if (numZeros > 0) {
                vetor[i - numZeros] = vetor[i];
                vetor[i] = 0;
            }
        }

        // Criação do vetor compacto
        vetorCompacto = new int[tamanho - numZeros];

        for (int i = 0; i < tamanho - numZeros; i++) {
            vetorCompacto[i] = vetor[i];
        }

        // Exibição do vetor compacto
        System.out.println("Vetor compactado:");
        for (int i = 0; i < tamanho - numZeros; i++) {
            System.out.print(vetorCompacto[i] + " ");
        }
    }
}
