/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Maior e a posicao
 */
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER
        Scanner sc = new Scanner(System.in);

        //Declarando as veriaveis e os vetores
        int[] vetor = new int[10];
        int maior = vetor[0];
        int posicao = 0;


        // Leitura dos números inteiros e armazenamento no vetor
        System.out.println("Digite os 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        // Impressão do vetor
        System.out.println("Vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Encontrar o maior elemento e sua posição
        for (int i = 1; i < 10; i++) {
            if (vetor[i] > 10) {
                maior = vetor[i];
                posicao = i;
            }
        }

        // Impressão do maior elemento e sua posição
        System.out.println("O maior elemento do vetor é: " + maior);
        System.out.println("Ele está na posição: " + posicao);
    }
}
