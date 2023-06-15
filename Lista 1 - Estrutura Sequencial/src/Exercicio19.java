/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Imc
 */
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        double altura,peso,imc;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.print("Digite o seu peso em Kg: ");
        peso = input.nextDouble();
        System.out.print("Digite a sua altura em metros: ");
        altura = input.nextDouble();

        // Calcula o IMC

        imc = peso / (altura * altura);

        // Exibindo o imc

        System.out.printf("O seu IMC é " + imc);
    }
}
