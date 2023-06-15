/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Descubrindo A idade
 */
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        int anoNascimento,anoAtual,idade,idade2028;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = input.nextInt();

        System.out.print("Digite o ano atual: ");
        anoAtual = input.nextInt();

        // Calculando a idade

        idade = anoAtual - anoNascimento;
        idade2028 = 2028 - anoNascimento;

        //Exibindo a idade

        System.out.println("A idade é: " + idade + " anos.");

        //Exibindo a idade em 2028

        System.out.println("Em 2028, a pessoa terá " + idade2028 + " anos.");
    }
}
