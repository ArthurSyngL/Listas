/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Categoria do nadador
 */
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int idade;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite a idade");
        idade = input.nextInt();

        // Situação do nadador

        if (idade>=5 && idade<=7){
            System.out.println("Infantil A");

        } else if(idade>=8 && idade<=10){

            System.out.println("Infantil B");

        }else if(idade>=11 && idade<=13){

            System.out.println("Juvenil A");

        }else if(idade>=14 && idade<=17){

            System.out.println("Juvenil B");

        }else if(idade>=18){

            System.out.println("Sênior");

        }

    }
}
