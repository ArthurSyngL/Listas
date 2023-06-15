/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando a hipotenusa
 */
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double cateto1,cateto2,hipotenusa;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Informe o valor do primeiro cateto: ");
        cateto1 = input.nextDouble();

        System.out.println("Informe o valor do segundo cateto: ");
        cateto2 = input.nextDouble();

        // CALCULANDO A Hipotenusa

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        // EXIBINDO A HIPOTENUSA

        System.out.println("A hipotenusa é: " + hipotenusa);
    }
}

