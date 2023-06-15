/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Situacao dos aulos
 */
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double n1, n2, n3, m, maior = 0, menor = 0;
        int i, mat, fre, totrep = 0, frerep = 0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETICAO ATE 10 ALUNOS

        for (i = 0; i < 10; i++) {

            // RECEBENDO OS DADOS

            System.out.println("Informe a matricula: ");
            mat = input.nextInt();
            System.out.println("Nota 1: ");
            n1 = input.nextDouble();
            System.out.println("Nota 2: ");
            n2 = input.nextDouble();
            System.out.println("Nota 3: ");
            n3 = input.nextDouble();
            System.out.println("Frequencia: ");
            fre = input.nextInt();

            //CALCULANDO A MEDIA E EXIBINDO A MATRICULA E A MEDIA
            m = (n1 + n2 + n3) / 3;

            System.out.println(+mat);
            System.out.println(+m);

            // VERIFICANDO A SITUACAO DO ALUNO

            if (m >= 6 && fre >= 40) {
                System.out.println("Aprovado.");
            } else if (m >= 6 && fre < 40) {
                System.out.println("Reprovado.");
                totrep++;
                frerep++;
            } else {
                System.out.println("Reprovado.");
                totrep++;
            }
            if (i == 0) {
                maior = m;
            } else if (m > maior) {
                maior = m;
            }
            if (i == 0) {
                menor = m;
            } else if (m < menor) {
                menor = m;
            }


        }

        //EXIBIMENTO FINAL

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Total reprovados: " + totrep);
        System.out.println("Porcentagem reprovados por falta: " + frerep * 10);

    }
}