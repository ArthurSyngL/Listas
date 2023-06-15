/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Vendo um numero se ele e divisivel por  10, 5, 2 ou nao é divisivel
 */
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite o numero");
        n = input.nextInt();

        // VENDO SE ELE E DIVISIVEL OU NAO

        if (n % 10 == 0) {
            System.out.println(n + " é divisível por 10.");
        } else if (n % 5 == 0) {
            System.out.println(n + " é divisível por 5.");
        } else if (n % 2 == 0) {
            System.out.println(n + " é divisível por 2.");
        } else {
            System.out.println(n + " não é divisível por 10, 5 ou 2.");
        }



    }
}
