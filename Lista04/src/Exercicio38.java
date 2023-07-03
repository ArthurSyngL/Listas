import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        int tamanho = 10; // Tamanho do vetor
        int[] vetor = new int[tamanho];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores:");

        for (int i = 0; i < tamanho; i++) {
            int valor = scanner.nextInt();
            inserirOrdenado(vetor, i, valor);
        }

        System.out.println("Valores em ordem crescente:");

        for (int valor : vetor) {
            System.out.println(valor);
        }
    }

    // Funcao para Ordenar o vetor

    public static void inserirOrdenado(int[] vetor, int tamanho, int valor) {
        int posicao = tamanho - 1;

        while (posicao >= 0 && vetor[posicao] > valor) {
            vetor[posicao + 1] = vetor[posicao];
            posicao--;
        }

        vetor[posicao + 1] = valor;
    }
}
