package Lista5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int[][] matriz = new int[12][4];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int[] totalPorMes = new int[12];
        int[] totalPorSemana = new int[4];
        int totalAnual = 0;

        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor das vendas para o mês " + meses[i] + ", semana " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();

                // Calcula o total vendido em cada mês
                totalPorMes[i] += matriz[i][j];

                // Calcula o total vendido em cada semana durante todo o ano
                totalPorSemana[j] += matriz[i][j];

                // Calcula o total vendido pela loja no ano
                totalAnual += matriz[i][j];
            }
        }

        // Imprime o total vendido em cada mês do ano
        for (int i = 0; i < 12; i++) {
            System.out.println("Total vendido em " + meses[i] + ": " + totalPorMes[i]);
        }

        // Imprime o total vendido em cada semana durante todo o ano
        for (int j = 0; j < 4; j++) {
            System.out.println("Total vendido na semana " + (j + 1) + " do ano: " + totalPorSemana[j]);
        }

        // Imprime o total vendido pela loja no ano
        System.out.println("Total vendido pela loja no ano: " + totalAnual);

        scanner.close();
    }
}
