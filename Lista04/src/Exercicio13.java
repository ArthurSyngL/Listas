package Lista4;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double[] valores = new double[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 valores:");
        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextDouble();
        }

        double maior = valores[0];
        double menor = valores[0];
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 1; i < 5; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                posicaoMaior = i;
            }

            if (valores[i] < menor) {
                menor = valores[i];
                posicaoMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior + ", posição: " + posicaoMaior);
        System.out.println("Menor valor: " + menor + ", posição: " + posicaoMenor);
    }
}

