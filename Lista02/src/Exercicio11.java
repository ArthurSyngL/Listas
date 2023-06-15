/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Numero divisivel por 3 e por 7
 */
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite o numero");
        n = input.nextInt();

        // VENDO SE O NUMERO E DIVISIVEL POR 3 E POR 7

        if (n % 3 == 0 && n % 7 == 0) {
            System.out.println(n + " é divisível por 3 e por 7.");
        } else {
            System.out.println(n + " não é divisível por 3 e por 7.");
        }

    }
}
