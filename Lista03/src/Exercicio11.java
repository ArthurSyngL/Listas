/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Compras a vista e a prazo
 */
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int i;
        double valor, soma = 0, pres, cvi = 0, cpi = 0;
        String cod;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETINDO PARA 15 TRANSACOES

        for(i = 0; i < 15;i ++){

            // RECEBENDO OS DADOS

            System.out.println("Digite o valor: ");
            valor = input.nextDouble();
            System.out.println("Qual e o Tipo de Transacao: (V: a vista) (P: a prazo)");
            cod = input.next();

            // CALCULANDO O TOTAL DE COMPRAS A VISTA E A PRAZO

            if(cod.equals("V")){

                cvi = cvi + valor;

            }else if(cod.equals("P")){

                cpi = cpi + valor;

                // CALCULANDO O VALOR DA PRIMEIRA PRESTACAO E EXIBINDO

                pres = valor / 3;
                System.out.println("Valor da primeira prestacao: "+pres);

            }

            // SOMA DO VALOR TOTAL

            soma = soma + valor;

        }

        // EXIBINDO OS TOTAL

        System.out.println("Total a vista: "+cvi);
        System.out.println("Total a prazo: "+cpi);
        System.out.println("Total: "+soma);

    }

}
