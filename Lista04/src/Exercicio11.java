import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        int quantidadeNegativos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                quantidadeNegativos++;
            } else {
                somaPositivos += numeros[i];
            }
        }

        System.out.println("Quantidade de números negativos: " + quantidadeNegativos);
        System.out.println("Soma dos números positivos: " + somaPositivos);
    }
}
