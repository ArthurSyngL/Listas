
/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Verificando se o número é igual a 5, 200, 400
 */
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite o numero");
        n = input.nextInt();


        // VERIFICANDO O NUMERO

        if (n == 5 || n == 200 || n == 400) {

            System.out.println("O número é igual a 5, 200 ou 400.");

        } else if (n >= 500 && n <= 1000) {

            System.out.println("O número está no intervalo entre 500 e 1000 (inclusive).");

        } else {

            System.out.println("O número está fora dos escopos anteriores.");

        }

    }

}
