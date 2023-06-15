/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Escolhendo o tipo de media
 */
import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int op, p1, p2, p3;
        double n1, n2, n3, m;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETICAO

        while (true) {

            // RECEBENDO OS DADOS

            System.out.println("Menu de opcoes:\n1.Media aritmetica\n2.Media ponderada\n3.Sair\n\nDigite a opcao desejada.");
            op = input.nextInt();

            // CALCULANDO A MEDIA DE ACORDO COM O QUE FOI ESCOLHIDO

            if (op == 1) {

                System.out.println("Nota 1: ");
                n1 = input.nextDouble();
                System.out.println("Nota 2: ");
                n2 = input.nextDouble();
                m = (n1 + n2) / 2;
                System.out.println("Media: " + m);

            } else if (op == 2) {

                System.out.println("Nota 1: ");
                n1 = input.nextDouble();
                System.out.println("Peso 1: ");
                p1 = input.nextInt();
                System.out.println("Nota 2: ");
                n2 = input.nextDouble();
                System.out.println("Peso 2: ");
                p2 = input.nextInt();
                System.out.println("Nota 3: ");
                n3 = input.nextDouble();
                System.out.println("Peso 3: ");
                p3 = input.nextInt();
                m = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
                System.out.println("Media: " + m);


            }
            //FINALIZANDO O WHILE SE FOR IGUAL A 3
            else if (op == 3) {
                System.out.println("Adeus...");
                break;
            } else {
                System.out.println("Erro digite novamente.");

            }
        }
    }
}
