/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
ler 10 numeros e verificar os numeros igual
 */
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        // Declarando Vetor

        int[] vetor = new int[10];

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebendo os valores

        System.out.println("Digite 10 valores:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Calculando e exibindo

        System.out.println("Valores iguais encontrados:");
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i]);
                }
            }
        }
    }
}

