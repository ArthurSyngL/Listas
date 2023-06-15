/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Acréscimo porcentual
 */
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        double precoCusto,precoVenda,percentualAcrescimo;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Digite o preço de custo do produto: ");
        precoCusto = input.nextDouble();

        System.out.print("Digite o percentual de acréscimo desejado: ");
        percentualAcrescimo = input.nextDouble();

        // CALCULANDO O ACRESCIMO

        precoVenda = precoCusto * (1 + percentualAcrescimo / 100);

        // EXIBINDO O VALOR COM ACRESCIMO

        System.out.println("O preço de venda do produto é: " + precoVenda);
    }
}
