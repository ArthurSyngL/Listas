/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Dolar
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        // Declaração de Variaveis
        float qd, d, vf;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Informe a quantidade do dolar");
        qd = input.nextFloat();

        System.out.println("Informe o preco do dolar");
        d = input.nextFloat();

        // CALCULANDO O DOLAR

        vf=qd*d;

        // EXIBINDO A CONVERÇÃO

        System.out.println("O valor e:"+ vf);
    }
}