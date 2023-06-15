/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando o investimento
 */
import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int cod,tip;
        double val, rm,por,s=0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETICAO

        while(true){

            // RECEBENDO OS DADOS

            System.out.println("Codigo da conta: ");
            cod = input.nextInt();

            // FINALIZANDO O WHILE QUANDO O CODIGO FOR IGUAL OU MENOR DO QUE 0

            if(cod <= 0){
                break;
            }

            // RECEBENDO OS DADOS

            System.out.println("Valor: ");
            val = input.nextDouble();
            s += val;
            System.out.println("Tipo de investimento: ");
            tip = input.nextInt();

            // CALCULANDO O INVESTIMENTO

            if(tip == 1){
                por = 1.5;
            }else if(tip == 2){
                por = 2;
            }else{
                por = 4;
            }

            //EXIBINDO E CALCULANDO E RENDIMENTO MENSAL
            rm = val + (val * por / 100);
            System.out.println("Rendimento mensal: "+rm);

        }
        //EXIBINDO TOTAL INVESTIDO
        System.out.println("Total de investimentos: "+s);
    }
}
