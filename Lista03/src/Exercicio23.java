/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Opiniao em relacao ao filme
 */
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int i, nota, id, co = 0, cr = 0, cb = 0;
        double m = 0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETICAO ATE 15 PESSOAS

        for (i = 0; i < 15; i++) {

            // RECEBENDO OS DADOS

            System.out.println("Opiniao: 3(otimo) / 2(bom) / 1(regular)");
            nota = input.nextInt();
            System.out.println("Idade: ");
            id = input.nextInt();

            // CALCULANDO A QUANTIDADE PELAS NOTAS DO FILME

            if (nota == 3) {
                m += id;
                co=co+1;
            }
            if (nota == 1) {
                cr=cr+1;
            }
            if (nota == 2) {
                cb=cb+1;
            }
        }

        // EXIBICAO FINAL E CALCULO MEDIA E PORCENTAGEM

        System.out.println("Media otimo: " + m / co);
        System.out.println("Regular: " + cr);
        System.out.println("Porcentagem bom: " + cb * 100 / 3);
    }
}