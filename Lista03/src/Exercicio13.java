/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Quantas pessoas que e acima de 90kg e a media das idades
 */
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int i, id, c = 0, s = 0;
        double pes, m;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        //REPETINDO PARA 7 PESSOAS

        for(i = 0; i < 7;i++){

            // RECEBENDO OS DADOS

            System.out.println("Idade: ");
            id = input.nextInt();
            System.out.println("Peso: ");
            pes = input.nextDouble();

            // CALCULANDO O PESO

            if(pes > 90){
                c = c + 1;
            }

            // SOMANDO AS IDADES

            s = s + id;

        }

        //CALCULANDO A MEDIA DE IDADE

        m = s / 7;

        //EXIBINDO MAIORES DE 90KG E A MEDIA DE IDADE

        System.out.println("Maiores de 90kg: "+c);
        System.out.println("Media de idade: "+m);

    }

}
