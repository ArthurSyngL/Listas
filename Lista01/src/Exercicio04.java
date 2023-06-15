/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando a Raiz
 */
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double a,b,c,delta,x1,x2;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.print("Digite o valor de a: ");
        a = input.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = input.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = input.nextDouble();

        // CALCULANDO A Raiz

        delta = Math.sqrt(b * b - 4 * a * c);
        x1 = (-b + delta) / (2 * a);
        x2 = (-b - delta) / (2 * a);

        // Exibindo as raizes

        System.out.println("As raízes são x1 = " + x1 + " e x2 = " + x2);
    }
}
