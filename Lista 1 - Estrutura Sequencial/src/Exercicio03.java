/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Desconto
 */
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {

            // DECLARACAO DE VARIAVEIS

            double valor,desconto,novoValor;

            //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

            Scanner input = new Scanner(System.in);

            //RECEBENDO O VALOR DO PRODUTO
            System.out.println("Digite o valor do produto: ");
            valor = input.nextDouble();

            // desconto de 9%
            desconto = 0.09;
            novoValor = valor * (1 - desconto);

            //EXIBINDO O VALOR COM DESCONTO
            System.out.println("O novo valor com desconto é: R$" + novoValor);

    }
}
