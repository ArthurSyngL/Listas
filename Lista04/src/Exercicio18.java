/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Encontra os multiplos de x
 */
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        // Declaracao de Variaveis e Vetor

        int[] vetor = new int[10];
        int x;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebendos os valores

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite um número X:");
        x = scanner.nextInt();

        // Calculando e Exibindo

        System.out.println("Múltiplos de " + x + " encontrados:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % x == 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
