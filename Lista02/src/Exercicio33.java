/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Recebendo o valor de x e calculando
 */
import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double x;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);


        // DADOS RECEBIDOS

        System.out.println("Digite os valor de x");
        x = input.nextDouble();

        // CALCULANDO X

        if (x<=1){
            
            x = 1;
            
            System.out.println(+x);
            
        } else if (1<x && x<=2) {
            
            x = 2;

            System.out.println(+x);
            
        } else if (2<x && x<=3) {

            x = x * x;

            System.out.println(+x);
        } else if (x>3) {
            x = x * x * x;

            System.out.println(+x);
        }


    }
}
