/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
ler 6 numeros e exibilos
 */
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner sc = new Scanner(System.in);

        //Declarando o vetor

        int[] valor = new int[6];

        // Lê os valores digitados pelo usuário

        System.out.println("Digite os valores");

        for (int i = 0; i<6; i++){
                valor[i] = sc.nextInt();
        }

        // Exibindo os valores lidos

        System.out.println("Valores lidos");

        for (int i = 0; i<6; i++){
            System.out.println( valor[i] );
        }
    }
}
