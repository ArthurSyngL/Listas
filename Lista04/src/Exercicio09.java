/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Lendo pares e ordem inversa
 */
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {

        //Declarando o vetor
        int[] valores = new int[6];

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Lendo os valores digitados
        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < 6; i++) {
            valores[i] = scanner.nextInt();
        }

        // Organizando na ordem inversa
        System.out.println("Valores lidos na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}

