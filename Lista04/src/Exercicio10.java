import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double[] notas = new double[15];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas dos 15 alunos:");
        for (int i = 0; i < 15; i++) {
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < 15; i++) {
            soma += notas[i];
        }

        double media = soma / 15;
        System.out.println("Média geral das notas: " + media);
    }
}
