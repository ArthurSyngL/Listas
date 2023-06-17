package Lista4;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double[] valores = new double[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 valores:");
        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextDouble();
        }

        double maior = valores[0];
        double menor = valores[0];
        double soma = valores[0];

        for (int i = 1; i < 5; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }

            if (valores[i] < menor) {
                menor = valores[i];
            }

            soma += valores[i];
        }

        double media = soma / 5;

        System.out.println("Valores lidos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(valores[i]);
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + media);
    }
}

