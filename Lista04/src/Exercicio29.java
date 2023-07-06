/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Receba 6 numeros inteiro
 */
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner sc = new Scanner(System.in);

        // Declarando Variaveis e vetor

        int[] numeros = new int[6];
        int somaPares = 0;
        int quantidadeImpares = 0;

        // Recebendo os valores e Calculando
        System.out.println("Digite 6 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " é par.");
                somaPares += numeros[i];
            } else {
                System.out.println(numeros[i] + " é ímpar.");
                quantidadeImpares++;
            }
        }
        // Exibindo

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    }
}
