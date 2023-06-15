/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Quantidade de pessoas maior ou igual a 18
 */
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int i, idade, idademaior = 0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETINDO PARA 10 pessoas

        for (i = 0; i < 10; i++) {

            // RECEBENDO OS DADOS

            System.out.println("Digite sua idade");
            idade = input.nextInt();

            if (idade>=18){
                idademaior = idademaior + 1;
            }

        }

        // EXIBINDO A QUANTIDADE DE PESSOA MAIOR OU IGUAL A 18

        System.out.println("A quantidade de pessoas maior ou igual a 18 e:" + idademaior);

    }

}
