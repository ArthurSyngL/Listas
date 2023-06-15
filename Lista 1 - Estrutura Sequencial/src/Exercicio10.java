import java.util.Scanner;

/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Converção celsuis para fahrenheit
 */
public class Exercicio10 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        double valorcompra, valorPrestacao;
        int numPrestacoes;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Digite o valor das compra");
        valorcompra = input.nextDouble();
        // Dividindo o valor para 5 prestação

        numPrestacoes = 5;
        valorPrestacao = valorcompra / numPrestacoes;

        // Exibindo o valor de cada prestação

        System.out.printf("O valor de cada prestação é: R$" + valorPrestacao);
    }
}
