/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Converção celsuis para fahrenheit
 */
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        Double celsius,fahrenheit;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Digite a temperatura em graus Celsius: ");
        celsius = input.nextDouble();

        // CONVERTENDO CELSIUS PARA FAHRENHEIT
        fahrenheit = (9 * celsius + 160) / 5;

        // EXIBINDO A CONVERÇÃO

        System.out.printf(celsius+" graus Celsius equivalem a "+ fahrenheit +" graus Fahrenheit.");
    }
}
