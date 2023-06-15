/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando fatorial de n
 */
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n, f = 1, i;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.println("Informe o numero: ");
        n = input.nextInt();

        // CALCULANDO FATORIAL DO NUMERO

        if (n == 0) {
            System.out.println(1);
        } else {
            for (i = 1; i < n + 1; i++) {
                f = f * i;
            }
        }

        // EXIBINDO O RESULTADO FINAL

        System.out.println(+f);

    }
}