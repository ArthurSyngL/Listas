/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Numero maior que 20
 */
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double n;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite o numero");
        n = input.nextDouble();

        // VENDO SE O NUMERO E MAIOR QUE 20
        if (n>20){

        //EXIBINDO O NUMERO MAIOR QUE 20

            System.out.println(+n);
        }
    }
}
