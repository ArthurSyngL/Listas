/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Area e o perímetro do quadrado
 */
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        double lado, area, perimetro;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Digite o tamanho do lado do quadrado: ");
        lado = input.nextDouble();

        // Calculo da área e o perímetro do quadrado

        area = Math.pow(lado, 2);
        perimetro = 4 * lado;

        // Exibindo a area e o perimetro

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O perímetro do quadrado é: " + perimetro);
    }
}
