/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Receba varias idades e faca a media
 */
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int q=0, idade, mediaidade = 0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.println("Digite a idade");
        idade = input.nextInt();

        // REPETICAO ATE QUANDO IDADE FOR DIFERENTE DE 0

        while (idade != 0){

            // SOMANDO A MEDIA E SOMANDO A QUANTIDADE
            mediaidade = mediaidade + idade;
            q=q+1;

            // RECEBENDO OS DADOS PARA CONTINUAR A REPETICAO

            System.out.println("Digite a idade");
            idade = input.nextInt();

        }

        // CALCULANDO A MEDIA

        mediaidade = mediaidade / q;

        System.out.println("A media de idade e:"+ mediaidade);

    }
}
