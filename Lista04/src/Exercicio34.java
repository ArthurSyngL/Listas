/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Numero digitado anteriormente
 */
import java.util.Scanner;
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarando vetor e variaveis

        int[] numeros = new int[10];
        int contador = 0, numero;

        // Recebendo os valores
        System.out.println("Digite 10 números diferentes:");

        while (contador < 10) {
            numero = sc.nextInt();

            if (numeroJaDigitado(numeros, numero)) {
                System.out.println("Número já digitado. Digite outro número:");
            } else {
                numeros[contador] = numero;
                contador++;
            }
        }

        // Exibindo

        System.out.println("Vetor final:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    // Funcao para saber que ja digitou o numero
    public static boolean numeroJaDigitado(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
}