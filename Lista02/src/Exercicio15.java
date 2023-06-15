/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Ordem decendente
 */
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int temp, a, b, c;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digites os numeros");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        // Lógica para ordenar os valores em ordem descendente usando uma variável temporária

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        // Exibindo os valores em ordem descendente

        System.out.println("Valores em ordem descendente: " + a + ", " + b + ", " + c);

    }
}
