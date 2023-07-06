/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
ler 10 numeros Soma dos negativos e dos positivos
 */
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        // Declarando variaveis e Vetor
        double[] numeros = new double[10];
        int quantidadeNegativos = 0;
        double somaPositivos = 0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebendo os numeros
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // Calculando e Exibindo
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
