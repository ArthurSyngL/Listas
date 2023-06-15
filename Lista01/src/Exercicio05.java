/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando o rendimento
 */
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double P, i, n, valorAcumulado;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.print("Digite o valor da aplicação mensal: ");
        P = input.nextDouble();

        System.out.print("Digite a taxa de juros (em decimal): ");
        i = input.nextDouble();

        System.out.print("Digite o número de meses: ");
        n = input.nextInt();

        // CALCULANDO O RENDIMENTO

        valorAcumulado = (P * (Math.pow(1 + i, n) - 1)) / i;

        // EXIBINDO O RENDIMENTO

        System.out.printf("O valor acumulado é R$" + valorAcumulado);
    }
}
