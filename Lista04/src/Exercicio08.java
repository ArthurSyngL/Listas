/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Ordem Inversa
 */
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        //Declarando o vetor

        int[] valores = new int[6];

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 6 valores inteiros:");

        // Lê os valores e armazena no array
        for (int i = 0; i < 6; i++) {
            valores[i] = scanner.nextInt();
        }

        System.out.println("Valores lidos na ordem inversa:");

        // Exibe os valores na ordem inversa
        for (int i = 5; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}
