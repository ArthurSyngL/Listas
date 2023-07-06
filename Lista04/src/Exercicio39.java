/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calcule N
 */
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {

        // Declarando variaveis e vetor

        int n = 0;
        int[][] triangulo = new int[n][];

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebendo
        System.out.print("Digite o número de linhas do Triângulo de Pascal: ");
        n = scanner.nextInt();

        // Criar e preencher o Triângulo de Pascal
        for (int i = 0; i < n; i++) {
            triangulo[i] = new int[i + 1];
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }

        // Imprimir o Triângulo de Pascal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
