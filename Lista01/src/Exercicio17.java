/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Rendimento
 */
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        double deposito,taxajuros,rendimento,vt;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Digite o valor do depósito: ");
        deposito = input.nextDouble();

        System.out.print("Digite o valor da taxa de juros (em %): ");
        taxajuros = input.nextDouble();

        // Calculando o rendimento

        rendimento = deposito * (taxajuros / 100);
        vt = deposito + rendimento;

        //Exibindo antes e depois do rendimento

        System.out.println("O valor do rendimento é: R$" + rendimento);
        System.out.println("O valor total depois do rendimento é: R$" + vt);

    }
}
