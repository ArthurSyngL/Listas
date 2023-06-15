/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando com o todos os tipos de operacoes, tipo de menu
 */
import java.util.Scanner;
public class Exercicio37 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int n1,n2,op;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.println("Numero 1: ");
        n1 = input.nextInt();
        System.out.println("Numero 2: ");
        n2 = input.nextInt();


        // REPETICAO

        while(true){

            // RECEBENDO OS DADOS

            System.out.println("Menu:\n1.Adicao\n2.Subtracao\n3.Multiplicacao\n4.Divisao\n5.Sair\nDigite sua opcao: ");
            op = input.nextInt();


            // CALCULANDO DE ACORDO COM A OPERACAO

            if(op == 1){
                System.out.println(n1 + n2);
            }else if(op == 2){
                System.out.println(n1 - n2);
            }else if(op == 3){
                System.out.println(n1 * n2);
            }else if(op == 4){
                if(n2 != 0){
                    System.out.println(n1 / n2);
                }else{
                    System.out.println("Nao e possivel dividir por zero.");
                }
            }// FINALIZANDO O WHILE QUANDO A OP FOR IGUAL A 5
            else if(op == 5){
                break;
            }

        }

    }

}
