/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Eliminindo elementos repetidos
 */
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        // Delcarando os vetor
        int[] vetor = new int[20];

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebendo os dados

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Calculando e Exibindo

        System.out.println("Elementos do vetor sem repetição:");
        for (int i = 0; i < 20; i++) {
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                System.out.println(vetor[i]);
            }
        }
    }
}

