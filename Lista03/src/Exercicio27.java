/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Porcentagem canal assitido
 */
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int can, np, i =0, c4 =0,c5 =0,c7 =0,c12 =0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETICAO

        while(true){

            // RECEBENDO OS DADOS

            System.out.println("Canal(4,5,7,12): ");
            can = input.nextInt();


            // CANAL FOR IGUAL A 0 PARA O WHILE

            if(can == 0) {
                break;
            }

            // RECEBENDO OS DADOS

            System.out.println("Numero de pessoas assistindo: ");
            np = input.nextInt();
            i+= np;

            // SOMANDO PARA FAZER A PORCENTAGEM DE ACORDO COM O CANAL

            if(can == 4){
                c4 += np;
            }else if(can == 5){
                c5 += np;
            }else if(can == 7){
                c7 += np;
            }else if(can == 12){
                c12 += np;
            }

        }

        // EXIBINDO A PORCENTAGEM DE CADA CANAL

        System.out.println("Porcentagem 4: "+c4 * 100 / i);
        System.out.println("Porcentagem 5: "+c5 * 100 / i);
        System.out.println("Porcentagem 7: "+c7 * 100 / i);
        System.out.println("Porcentagem 12: "+c12 * 100 / i);
    }
}
