/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Uniao de dois valores anteriores
 */
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio31 {
    public static void main(String[] args) {

        // Declaracao de Vetor

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorUniao = new int[20];
        int contador = 0;

        // Leitura do primeiro vetor
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = lerNumero();
        }

        // Leitura do segundo vetor
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = lerNumero();
        }

        // União dos vetores
        for (int i = 0; i < 10; i++) {
            if (!contemElemento(vetorUniao, contador, vetor1[i])) {
                vetorUniao[contador] = vetor1[i];
                contador++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (!contemElemento(vetorUniao, contador, vetor2[i])) {
                vetorUniao[contador] = vetor2[i];
                contador++;
            }
        }

        // Exibição do vetor de união
        System.out.println("Vetor de união: " + Arrays.toString(vetorUniao));
    }

    // Função para ler um número do teclado
    private static int lerNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    // Função para verificar se um elemento já existe no vetor
    private static boolean contemElemento(int[] vetor, int tamanho, int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }
}

