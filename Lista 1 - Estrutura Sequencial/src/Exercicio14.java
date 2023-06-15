/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Aumento 37% no salario
 */
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        double salario,novoSalario;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Digite o salário atual: ");
        salario = input.nextDouble();

        // calcula o novo salário com aumento de 37%

        novoSalario = salario * 1.37;

        // Exibindo a area e o perimetro

        System.out.printf("O novo salário é: R$\n" + novoSalario);
    }
}
