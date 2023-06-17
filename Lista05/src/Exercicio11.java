package Lista5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int[] idades = new int[8];
        int[] disciplinas = new int[5];
        int[][] provas = new int[8][5];

        Scanner scanner = new Scanner(System.in);

        // Recebe as idades dos alunos
        System.out.println("Digite as idades dos 8 alunos:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        // Recebe os códigos das disciplinas
        System.out.println("Digite os códigos das 5 disciplinas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Disciplina " + (i + 1) + ": ");
            disciplinas[i] = scanner.nextInt();
        }

        // Recebe a quantidade de provas feitas por cada aluno em cada disciplina
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Quantidade de provas feitas pelo aluno " + (i + 1) + " na disciplina " + disciplinas[j] + ": ");
                provas[i][j] = scanner.nextInt();
            }
        }

        // a) Calcula a quantidade de alunos com idade entre 18 e 25 anos e que fizeram mais de duas provas em uma disciplina com código digitado pelo usuário
        int quantidadeAlunos = 0;
        System.out.print("Digite o código de uma disciplina: ");
        int codigoDisciplina = scanner.nextInt();
        for (int i = 0; i < 8; i++) {
            if (idades[i] >= 18 && idades[i] <= 25 && provas[i][Arrays.binarySearch(disciplinas, codigoDisciplina)] > 2) {
                quantidadeAlunos++;
            }
        }
        System.out.println("Quantidade de alunos com idade entre 18 e 25 anos e que fizeram mais de duas provas na disciplina " + codigoDisciplina + ": " + quantidadeAlunos);

        // b) Lista os alunos que fizeram menos de três provas em cada disciplina
        System.out.println("Alunos que fizeram menos de três provas em cada disciplina:");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 8; i++) {
                if (provas[i][j] < 3) {
                    System.out.println("Aluno: " + (i + 1) + ", Disciplina: " + disciplinas[j]);
                }
            }
        }

        // c) Calcula a média de idade dos alunos que não fizeram nenhuma prova em alguma disciplina
        int[] alunosSemProva = new int[8];
        int quantidadeAlunosSemProva = 0;
        for (int i = 0; i < 8; i++) {
            boolean fezProva = false;
            for (int j = 0; j < 5; j++) {
                if (provas[i][j] > 0) {
                    fezProva = true;
                    break;
                }
            }
            if (!fezProva) {
                alunosSemProva[quantidadeAlunosSemProva] = idades[i];
                quantidadeAlunosSemProva++;
            }
        }

        int somaIdades = 0;
        for (int i = 0; i < quantidadeAlunosSemProva; i++) {
            somaIdades += alunosSemProva[i];
        }

        double mediaIdades = quantidadeAlunosSemProva > 0 ? (double) somaIdades / quantidadeAlunosSemProva : 0;

        System.out.println("Média de idade dos alunos que não fizeram nenhuma prova em alguma disciplina: " + mediaIdades);

        scanner.close();
    }
}
