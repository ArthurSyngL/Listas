/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Dia da semana correspondente ao numero informado
 */
import java.util.Scanner;
public class Exercicio41 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite um numero");
        n = input.nextInt();

        // Vendo que dia da semana e correspondente de acordo como o numero informadp

        if (n ==1){

            System.out.println("Segunda-feira");

        } else if (n == 2 ) {

            System.out.println("Terça-feira");

        } else if (n ==3) {

            System.out.println("Quarta-feira");

        } else if (n ==4) {

            System.out.println("Quinta-feira");

        } else if (n == 5) {

            System.out.println("Sexta-feira");

        } else if (n ==6) {

            System.out.println("Sabado");

        } else if (n ==7) {

            System.out.println("Domingo");

        }else {

            System.out.println("Não existe dia da semana correspondente a esse numero");

        }

    }

}
