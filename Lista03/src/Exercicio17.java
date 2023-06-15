/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Media idade
 */
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int i, id, c = 0, s = 0, cont = 0;
        String sex;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        //REPETINDO PARA 7 PESSOAS

        for (i = 0; i < 7; i++) {

            // RECEBENDO OS DADOS

            System.out.println("Idade: ");
            id = input.nextInt();
            System.out.println("Sexo(M/F): ");
            sex = input.next();

            // SOMANDO DE ACORDO COM O SEXO

            if (sex.equals("M")) {

                c += id;

            } else if (sex.equals("F")) {

                cont += id;

            }

            // SOMANDO

            s = s + id;

        }

        // EXIBINDO A MEDIA E CALCULANDO

        System.out.println("Media de idade: " + (s / 7));
        System.out.println("Media de idade feminina: " + (c / 7));
        System.out.println("Media de idade masculina: " + (cont / 7));


    }
}