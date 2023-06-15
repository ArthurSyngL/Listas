/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Acréscimo porcentual veiculos
 */
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        double percentDistribuidor,custoFabrica,custoConsumidor,impostos;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Digite o custo de fábrica do carro: ");
        custoFabrica = input.nextDouble();

        // Percentagens do distribuidor e dos impostos

        percentDistribuidor = 0.28;
        impostos = 0.45;

        custoConsumidor = custoFabrica + (custoFabrica * impostos) + (custoFabrica * percentDistribuidor);

        // Exibindo o valor com a porcentagem de acrescimo

        System.out.printf("O custo ao consumidor do carro é de R$ \n" + custoConsumidor);
    }
}
