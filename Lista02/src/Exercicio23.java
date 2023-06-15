/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Classificação pela idade
 */
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int idade;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite a idade");
        idade = input.nextInt();

        // Vendo a classificação pela idade

        if(idade >= 65) {
            System.out.println("Pessoa idosa");
        } else if(idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }



    }
}
