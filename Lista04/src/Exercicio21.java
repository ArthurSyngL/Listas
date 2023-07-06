/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Vetor A B C
 */
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        //Declaracao de vetor

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebendo os valores

        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 números inteiros para o vetor B:");
        for (int i = 0; i < 10; i++) {
            vetorB[i] = scanner.nextInt();
        }

        // Calculando e Exibindo

        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("Vetor C (C = A - B):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
