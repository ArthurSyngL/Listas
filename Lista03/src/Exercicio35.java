/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Somas parciais
 */
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n, sp = 0, sn = 0, s;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETICAO

        while (true) {

            // RECEBENDO OS DADOS

            System.out.println("Informe o numero: ");
            n = input.nextInt();

            //FINALIZANDO O WHILE SE FOR IGUAL A 0

            if (n == 0) {
                break;
            }

            //CALCULANDO SOMAS

            if (n > 0) {
                sp += n;
            } else {
                sn += n;
            }

        }

        // SOMA TOTAL E EXIBIMENTO FINAL

        s = sp + sn;

        System.out.println("Soma positivos: " + sp);
        System.out.println("Soma negativos: " + sn);
        System.out.println("Soma: " + s);
    }
}
