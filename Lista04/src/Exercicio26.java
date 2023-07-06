/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Desvio padrao de um vetor
 */
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarando variaveis e vetor
        int QTD_ELEMENTOS = 4;
        int[] vetor = new int[QTD_ELEMENTOS];
        int somatorio = 0;
        float media, variacoes = 0, sigma, v;

        Scanner scanner = new Scanner(System.in);

        // Recebendo os valores

        for (int i = 0; i < QTD_ELEMENTOS; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        // Calculando e Exibindo
        for (int i = 0; i < QTD_ELEMENTOS; i++) {
            somatorio += vetor[i];
        }

        media = (float) somatorio / QTD_ELEMENTOS;

        for (int i = 0; i < QTD_ELEMENTOS; i++) {
            v = vetor[i] - media;
            variacoes += v * v;
        }

        sigma = (float) Math.sqrt(variacoes / QTD_ELEMENTOS);
        System.out.printf("Resultado d = %.2f\n", sigma);
    }
}