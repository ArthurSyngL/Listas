/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Quarto valores e recebe maior e menor
 */
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int a, b, c, d, menor, maior;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite os valores de a, b, c, d");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        // MAIIOR E MENOR RECENBENDO A

        maior = a;
        menor = a;

        // Encontra o maior valor

        if (b > maior) {

            maior = b;

        }else if (c > maior) {

            maior = c;

        }else if (d > maior) {

            maior = d;

        }

        // Encontra o menor valor

        if (b < menor) {

            menor = b;

        }else if (c < menor) {

            menor = c;

        }else if (d < menor) {

            menor = d;

        }

        //EXIBINDO O MAIOR E MENOR VALOR

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
