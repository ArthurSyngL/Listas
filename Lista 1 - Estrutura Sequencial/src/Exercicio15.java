/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Segundos para dias, horas e minutos
 */
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        int segundos,dias,horas,minutos;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Entre com a quantidade de segundos: ");
        segundos = input.nextInt();

        // Calculando o segundo
        dias = segundos / 86400;
        segundos %= 86400;

        horas = segundos / 3600;
        segundos %= 3600;

        minutos = segundos / 60;
        segundos %= 60;

        // Exibindo o tempo

        System.out.println("Tempo correspondente a " + dias + " dias, " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
    }
}
