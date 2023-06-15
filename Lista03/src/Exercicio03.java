/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Tabuada 1 a 10
 */
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int i,j, resultado;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // Loop para tabuada de 1 a 10

        for (i = 1; i <= 10; i++) {

            System.out.println("Tabuada do " + i + ":");

            // Loop para tabuada de 1 a 10 e exibir os resultados da multiplicação

            for (j = 1; j <= 10; j++) {
                resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            // Adiciona uma linha em branco entre as tabuadas

            System.out.println();

        }
    }
}
