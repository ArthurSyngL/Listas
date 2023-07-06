/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Media geral de 15 Alunos
 */
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        //Declarando o vetor e variaveis

        double[] notas = new double[15];
        double media, soma = 0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Lendo as notas
        System.out.println("Digite as notas dos 15 alunos:");
        for (int i = 0; i < 15; i++) {
            notas[i] = scanner.nextDouble();
        }

       // Calculando e Exibindo
        for (int i = 0; i < 15; i++) {
            soma += notas[i];
        }

        media = soma / 15;
        System.out.println("Média geral das notas: " + media);
    }
}
