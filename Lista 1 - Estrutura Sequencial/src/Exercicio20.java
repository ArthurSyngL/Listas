/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Apartamentos
 */
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        int numApartamentos;
        double valorDiaria,valorPromocionalDiaria,valorTotalOcupacaoTotal,valorTotalOcupacao70,valorPerdidoPromocao;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // Leitura do número de apartamentos e valor da diária

        System.out.print("Digite o número de apartamentos do hotel: ");
        numApartamentos = input.nextInt();
        System.out.print("Digite o valor da diária por apartamento: R$");
        valorDiaria = input.nextDouble();

        // Cálculo do valor promocional da diária com 25% de desconto

        valorPromocionalDiaria = valorDiaria * 0.75;

        // Cálculo do valor total a ser arrecadado com 100% de ocupação
        valorTotalOcupacaoTotal = numApartamentos * valorDiaria * 2;

        // Cálculo do valor total a ser arrecadado com 70% de ocupação
        valorTotalOcupacao70 = numApartamentos * valorDiaria * 2 * 0.7;

        // Cálculo do valor que o hotel deixará de arrecadar com a promoção
        valorPerdidoPromocao = (numApartamentos * valorDiaria * 2) - (numApartamentos * valorPromocionalDiaria * 2);

        // Impressão dos resultados
        System.out.printf("Valor promocional da diária: R$%.2f%n", valorPromocionalDiaria);
        System.out.printf("Valor total a ser arrecadado com 100%% de ocupação: R$%.2f%n", valorTotalOcupacaoTotal);
        System.out.printf("Valor total a ser arrecadado com 70%% de ocupação: R$%.2f%n", valorTotalOcupacao70);
        System.out.printf("Valor que o hotel deixará de arrecadar com a promoção: R$%.2f%n", valorPerdidoPromocao);
    }
}
