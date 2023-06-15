/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Tabuada de um numero recebido
 */
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int i, j, resultado;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.println("Digite um numero");
        i = input.nextInt();

        // Loop para tabuada de 1 a 10 e exibir os resultados da multiplicação

        for (j = 1; j <= 10; j++) {
            resultado = i * j;
            System.out.println(i + " x " + j + " = " + resultado);
        }
    }
}



