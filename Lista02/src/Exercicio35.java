/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando x
 */
import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double x;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);


        // DADOS RECEBIDOS

        System.out.println("Digite os valor de x");
        x = input.nextDouble();


        // CALCULANDO X

        x = 5 * x+3 / Math.pow(x , 2) - 16;

        // Exibindo o x

        System.out.println(+x);
    }
}
