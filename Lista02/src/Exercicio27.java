/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Media e situação do aluno
 */
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double nt1, nt2, media;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite as notas");
        nt1 = input.nextInt();
        nt2 = input.nextInt();

        // CALCULANDO A MEDIA

        media = (nt1 + nt2) / 2;

        // Situação do aluno

        if (media >= 7) {

            System.out.println("Aprovado");

        } else if (media < 3) {

            System.out.println("Reprovado");

        } else {

            System.out.println("Exame");

        }

    }
}
