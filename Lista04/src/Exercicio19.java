/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Posicao do elemento
 */
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner sc = new Scanner(System.in);

        // Declarando vetor

        int[] vetor = new int[50];

        // Calculando e Exibindo

        for (int i = 0; i < 50; i++) {
            vetor[i] = (i + 5 * i) % (i + 1);
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
