/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Receba um tipo da acao da bolsa
 */
import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double pc, pv, luc, s = 0;
        String ac;
        int acm = 0, ind = 0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETICAO

        while (true) {

            // RECEBENDO OS DADOS

            System.out.println("Nome da acao: ");
            ac = input.next();

            // IDADE FOR MENOR QUE 0 PARA O WHILE

            if (ac.equals("F")) {
                break;
            }

            // RECEBENDO OS DADOS

            System.out.println("Preco de compra: ");
            pc = input.nextDouble();
            System.out.println("Preco de venda: ");
            pv = input.nextDouble();

            // CALCULANDO O LUCRO E EXIBINDO

            luc = pv - pc;
            System.out.println("Lucro: " + luc);

            if (luc > 1000) {
                acm++;
            }
            if (luc < 200) {
                ind++;
            }

            s += luc;

        }

        // EXIBIMENTO FINAL

        System.out.println("Lucro acima de 1000: " + acm);
        System.out.println("Lucro inferior a 200: " + ind);
        System.out.println("Lucro total: " + s);

    }

}