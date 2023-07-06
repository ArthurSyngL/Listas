/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Posicao Impares e pares
 */
import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {

        // Declarando os vetor

        int tamanho = 10;
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorResultado = new int[tamanho * 2];

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebenco os valores
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = scanner.nextInt();
        }

        // Calculando e Exibindos os valores

        for (int i = 0; i < tamanho; i++) {
            vetorResultado[i * 2] = vetor1[i];
            vetorResultado[(i * 2) + 1] = vetor2[i];
        }

        System.out.println("Vetor resultado:");
        for (int i = 0; i < vetorResultado.length; i++) {
            System.out.print(vetorResultado[i] + " ");
        }
    }
}
