/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Maior, media e menor dos valores
 */
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {

        // Declarando Variaveis e vetor

        double[] valores = new double[5];
        double maior = valores[0], menor = valores[0], soma = valores[0], media;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebendo os valores

        System.out.println("Digite 5 valores:");
        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextDouble();
        }

        // Calculando e exibindo

        for (int i = 1; i < 5; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }

            if (valores[i] < menor) {
                menor = valores[i];
            }

            soma += valores[i];
        }

        media = soma / 5;

        System.out.println("Valores lidos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(valores[i]);
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + media);
    }
}

