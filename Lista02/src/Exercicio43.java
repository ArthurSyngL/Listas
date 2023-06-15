/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Peso em outros planetas
 */
import java.util.Scanner;
public class Exercicio43 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n;
        double peso;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite um numero e o peso");
        n = input.nextInt();
        peso = input.nextDouble();

        // Calculo do peso em outro planeta e a exibição do peso e qual planeta é

        if (n == 1){
            peso = peso * 0.37;
            System.out.println("Planeta e Mercúrio e o peso e \n" + peso);
        }else if (n == 2) {
            peso = peso * 0.88;
            System.out.println("Planeta e Vênus e o peso e \n" + peso);
        }else if (n == 3) {
            peso = peso * 0.38;
            System.out.println("Planeta e Marte e o peso e \n" + peso);
        }else if (n == 4) {
            peso = peso * 2.64;
            System.out.println("Planeta e Júpiter e o peso e \n" + peso);
        }else if (n == 5) {
            peso = peso * 1.15;
            System.out.println("Planeta e Saturno e o peso e \n" + peso);
        }else if (n == 6) {
            peso = peso * 1.17;
            System.out.println("Planeta e Urano e o peso e \n" + peso);
        }

    }

}
