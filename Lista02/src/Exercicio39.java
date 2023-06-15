/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando as calorias de uma refeição
 */
import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {

        // Tabela de calorias das opções e a declaração de variaveis de calorias

        int[]caloriasPratos = { 180, 230, 250, 350 };
        int[] caloriasSobremesas = { 75, 110, 170, 200 };
        int[] caloriasBebidas = { 5, 70, 100, 65 };


        // Declaração de Variaveis

        int prato, sobremesa, bebida, caloriasTotais;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // Leitura das opções escolhidas pelo usuário

        System.out.println("Escolha o prato: 1 - vegetariano, 2 – Peixe, 3 – Frango, 4 – Carne");
        prato = input.nextInt();

        System.out.println("Escolha a sobremesa: 1 – Abacaxi, 2 – Sorvete diet, 3 – Mouse diet, 4 – Mouse chocolate");
        sobremesa = input.nextInt();

        System.out.println("Escolha a bebida: 1 – Chá, 2 - Suco de laranja, 3 – Suco de melão, 4 – Refrigerante diet");
        bebida = input.nextInt();

        // Cálculo das calorias totais da refeição

        caloriasTotais = caloriasPratos[prato - 1] + caloriasSobremesas[sobremesa - 1] + caloriasBebidas[bebida - 1];

        // Impressão do resultado

        System.out.println("A quantidade total de calorias da sua refeição é: " + caloriasTotais + " calorias");

    }
}
