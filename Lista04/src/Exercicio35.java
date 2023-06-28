import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        // Leitura dos números a e b
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número a: ");
        int a = sc.nextInt();
        System.out.print("Digite o número b: ");
        int b = sc.nextInt();

        // Criação dos vetores para representar os algarismos dos números
        int[] vetorA = criarVetor(a);
        int[] vetorB = criarVetor(b);

        // Realização da soma usando apenas os vetores
        int[] resultado = somarVetores(vetorA, vetorB);

        // Exibição do resultado
        System.out.print("Resultado da soma: ");
        for (int i = resultado.length - 1; i >= 0; i--) {
            System.out.print(resultado[i]);
        }
        System.out.println();
    }

    // Função para criar o vetor de algarismos de um número
    public static int[] criarVetor(int numero) {
        int[] vetor = new int[4]; // Vetor de tamanho fixo para representar números menores que 10000

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numero % 10; // Obtém o último algarismo do número
            numero /= 10; // Remove o último algarismo do número
        }

        return vetor;
    }

    // Função para realizar a soma de dois vetores
    public static int[] somarVetores(int[] vetorA, int[] vetorB) {
        int[] resultado = new int[vetorA.length];
        int carry = 0; // Variável de transporte (carry) inicializada com zero

        for (int i = 0; i < vetorA.length; i++) {
            int soma = vetorA[i] + vetorB[i] + carry; // Soma os algarismos e o carry

            if (soma >= 10) {
                resultado[i] = soma - 10; // Armazena apenas o dígito menos significativo
                carry = 1; // Atualiza o carry para a próxima posição
            } else {
                resultado[i] = soma;
                carry = 0; // Não há transporte para a próxima posição
            }
        }

        return resultado;
    }
}
