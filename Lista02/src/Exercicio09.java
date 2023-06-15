/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Multiplo de 3
 */
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int a, b;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digites os numeros");
        a = input.nextInt();
        b = input.nextInt();

        if (a % b == 0){
            System.out.println("Numero e divisivel");
        }else {
            System.out.println("Numero nao e divisivel");
        }


    }
}
