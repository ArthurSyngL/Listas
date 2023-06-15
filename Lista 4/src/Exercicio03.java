import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarando os Vetores
        double[] vetorOriginal = new double[10];
        double[] vetorQuadrado = new double[10];


        // Lendo o conjunto de números reais e armazenando no vetorOriginal
        System.out.println("Digite os 10 números reais:");
        for (int i = 0; i < 10; i++) {
            vetorOriginal[i] = sc.nextDouble();
        }

        // Calculando o quadrado das componentes do vetorOriginal e armazenando no vetorQuadrado
        for (int i = 0; i < 10; i++) {
            vetorQuadrado[i] = Math.pow(vetorOriginal[i], 2);
        }

        // Imprimindo ambos os conjuntos
        System.out.println("Vetor Original:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }

        System.out.println("\nVetor Quadrado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorQuadrado[i] + " ");
        }
    }
}
