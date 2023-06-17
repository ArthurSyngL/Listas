package Lista5;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[15][5];
        String[] nomes = new String[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            for (int j = 0; j < 5; j++) {
                System.out.print("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notas[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        System.out.println("Resultados:");

        double mediaClasse = 0;

        for (int i = 0; i < 15; i++) {
            double somaNotas = 0;

            for (int j = 0; j < 5; j++) {
                somaNotas += notas[i][j];
            }

            double media = somaNotas / 5;
            mediaClasse += media;

            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Média: " + media);

            if (media >= 7) {
                System.out.println("Situação: Aprovado");
            } else if (media < 4) {
                System.out.println("Situação: Reprovado");
            } else {
                System.out.println("Situação: Exame");
            }

            System.out.println();
        }

        mediaClasse /= 15;
        System.out.println("Média da classe: " + mediaClasse);

        scanner.close();
    }
}
