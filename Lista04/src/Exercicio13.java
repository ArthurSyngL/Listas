/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Posicao do maior e menor
 */
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        //Declarando o vetor e variaveis

        double[] valores = new double[5];
        double maior = valores[0], menor = valores[0];
        int posicaoMaior = 0, posicaoMenor = 0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Lendos os valores
        System.out.println("Digite 5 valores:");
        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextDouble();
        }

        // Calculando e exibindo

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

