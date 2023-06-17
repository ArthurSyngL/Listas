import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        int[] numeroAluno = new int[10];
        double[] alturaAluno = new double[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número do aluno " + (i + 1) + ": ");
            numeroAluno[i] = scanner.nextInt();
            System.out.print("Digite a altura do aluno " + (i + 1) + " em metros: ");
            alturaAluno[i] = scanner.nextDouble();
        }

        int indiceAlunoMaisBaixo = 0;
        int indiceAlunoMaisAlto = 0;

        for (int i = 1; i < 10; i++) {
            if (alturaAluno[i] < alturaAluno[indiceAlunoMaisBaixo]) {
                indiceAlunoMaisBaixo = i;
            }
            if (alturaAluno[i] > alturaAluno[indiceAlunoMaisAlto]) {
                indiceAlunoMaisAlto = i;
            }
        }

        System.out.println("Aluno mais baixo: Número " + numeroAluno[indiceAlunoMaisBaixo] +
                ", altura: " + alturaAluno[indiceAlunoMaisBaixo] + " metros.");
        System.out.println("Aluno mais alto: Número " + numeroAluno[indiceAlunoMaisAlto] +
                ", altura: " + alturaAluno[indiceAlunoMaisAlto] + " metros.");
    }
}
