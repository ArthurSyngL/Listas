/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Verificando qual e o triangulo de acordo com o angulo
 */
import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double a,b,c;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite os valores");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        // Verifica se os valores podem ser lados de um triângulo

        if (a < b + c && b < a + c && c < a + b) {

            // Classificando o triangulo de acordo com os angulos

            if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {

                System.out.println("Triângulo Retângulo");

            } else if (a*a > b*b + c*c || b*b > a*a + c*c || c*c > a*a + b*b) {

                System.out.println("Triângulo Obtusângulo");

            } else {

                System.out.println("Triângulo Acutângulo");

            }

        } else {

            System.out.println("Nao pode ser triangulo");

        }

    }
}
