/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando IMC
 */
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double peso, altura, imc;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite o peso e a altura");
        peso = input.nextDouble();
        altura = input.nextDouble();

        // Calculando o imc

        imc = peso / (altura * altura);

        // Situação do peso

        if (imc < 20){
            System.out.println("Abaixo do peso");

        } else if(imc>20 && imc<25){

            System.out.println("Peso normal");

        }else if(imc>25 && imc<30){

            System.out.println("Sobre o peso");

         }else if(imc>30 && imc<40){

            System.out.println("Obeso");

        }else if(imc>40){

            System.out.println("Obeso Mórbido");

        }

    }
}
