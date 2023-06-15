/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Numero Impar ou par
 */
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite o numero");
        n = input.nextInt();

        //VENDO SE O NUMERO E PAR OU IMPAR

        if(n%2==0){

            //Exibindo o numero par

            System.out.println("O numero e par");

        }else{

            //Exibindo o numero impar

            System.out.println("O numero e impar");
        }

    }

}
