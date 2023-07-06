/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
ler 6 numeros e exibilos
 */
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {

        // Declarando variaveis e vetor

        int tamanho = 10;
        int[] vetor = new int[tamanho];

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebendo
        System.out.println("Digite os valores:");

        for (int i = 0; i < tamanho; i++) {
            int valor = scanner.nextInt();
            inserirOrdenado(vetor, i, valor);
        }

        // Exibindo
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
