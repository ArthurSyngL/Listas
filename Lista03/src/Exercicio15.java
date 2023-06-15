/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Quantidade de numeros entre 30 a 90
 */
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int i, quantidade=0, n;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        //REPETINDO PARA 10 NUMEROS

        for(i = 0;i < 10;i++){

            // RECEBENDO OS DADOS

            System.out.println("Informe o número: ");
            n = input.nextInt();

            // VENDO QUAL E A QUATIDADE DE NUMEROS QUE FICA ENTRE 30 E 90
            if(n > 30 && n < 90){
                quantidade = quantidade +1;
            }

        }

        //MOSTRANDO A QUANTIDADE DE NUMEROS

        System.out.println("Qtd: "+quantidade);
    }
}
