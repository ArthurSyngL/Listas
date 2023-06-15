/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Adição e substituição
 */
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n1,n2,rf;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.println("Digite os dois numeros");
        n1 = input.nextInt();
        n2 = input.nextInt();

        //SOMANDO OS VALORES

        rf=n1+n2;

        //VENDO SE TEM QUE SOMAR OU DIMINUIR
        if (rf>20) {

            //SOMANDO MAIS 8 PRA NUMERO MAIOR QUE 20

            rf = rf + 8;

        }else if (rf<=20){

            // DIMINUINDO 5 PRA NUMERO MENOR QUE 20

            rf = rf - 5;

        }

        //EXIBINDO O RESULTADO

        System.out.println("Resultado :" + rf );

    }
}
