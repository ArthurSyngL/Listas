/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Pode ser um valor de um triangulo
 */
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int a,b,c;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite as notas");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        // VERIFICANDO SE E UM TRIANGULO

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Pode virar um triangulo");
        } else {
            System.out.println("Nao pode virar um triangulo");
        }

    }
}
