import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declarando variaveis e os vetores
        int[] vetor = new int[10];
        int contadorPares = 0;

        // Leitura dos valores do vetor
        System.out.println("Digite os valores do vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        // Contagem dos valores pares
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }

        // Impressão do resultado
        System.out.println("O vetor possui " + contadorPares + " valores pares.");

    }
}
