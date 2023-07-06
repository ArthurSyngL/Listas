/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Soma de X e Y
 */
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarando a variavel e o vetor
        int[] vetor = new int[8];
        int x, y;

        // Lendo o vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        // Lendo os valores de X e Y
        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();

        // Verificando se X e Y estão dentro do intervalo válido
        if (x >= 0 && x < vetor.length && y >= 0 && y < vetor.length) {
            // Calculando a soma
            int soma = vetor[x] + vetor[y];
            System.out.println("A soma dos valores nas posições X e Y é: " + soma);
        } else {
            System.out.println("Valores de X e Y estão fora do intervalo válido.");
        }
    }
}