/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Numeros de degraus
 */
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        double alturaDegrau,alturaDesejada;
        int numDegraus;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Qual a altura de cada degrau em centímetros? ");
        alturaDegrau = input.nextDouble();

        System.out.print("Qual a altura que você deseja alcançar em centímetros? ");
        alturaDesejada = input.nextDouble();

        // Calculando o numero de degraus

        numDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau);

        //Exibindo numeros de degraus

        System.out.println("Você precisa subir " + numDegraus + " degraus para alcançar a altura desejada.");
    }
}
