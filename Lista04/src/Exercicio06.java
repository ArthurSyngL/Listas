/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Maior e menor dos valores lidos
 */
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER
        Scanner sc = new Scanner(System.in);

        // Declarando o vetor e as variaveis
        int[] vetor = new int[10];
        int maior, menor;

        // Leitura dos valores do vetor
        System.out.println("Digite os valores do vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        // Encontrar o maior e o menor elementoc
        maior = vetor[0];
        menor = vetor[0];

        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        // Impressão do maior e menor elemento
        System.out.println("O maior elemento do vetor é: " + maior);
        System.out.println("O menor elemento do vetor é: " + menor);

    }
}
