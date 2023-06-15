/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Bonus de 10% para compra menor que 1000 e 15% caso contrario
 */
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double i, valorcompras, bonus;
        String nome;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETINDO PARA 15 CLIENTES

        for (i=0; i < 15; i++){

            // DADOS RECEBIDOS

            System.out.println("Digite o seu nome e o valor da compra do ano passado");
            nome = input.next();
            valorcompras = input.nextDouble();

            // Aumento de 10% ou 15% de acordo com o valor da compra

            if (valorcompras < 1000){

                // Bônus de 10% para compras abaixo de 1000

                bonus = valorcompras * 0.1;

            } else{

                // Bônus de 15% para compras de 1000 ou mais

                bonus = valorcompras * 0.15;

            }

            System.out.println("O bônus é: " + bonus);


        }

    }

}
