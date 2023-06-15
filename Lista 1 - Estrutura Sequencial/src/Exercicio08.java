/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Equação Linear
 */
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        //DECLARAÇÃO DE VARIAVEIS

        double a,b,c,d,e,f,y,x,res;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // RECEBENDO OS DADOS

        System.out.println("Digite os coeficientes a, b e c da primeira equação:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        System.out.println("Digite os coeficientes d, e e f da segunda equação:");
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        // RESOLVENDO A EQUAÇÃO

        y = (a * f - c * d) / (a * e - b * d);
        x = (c * e - b * f) / (a * e - b * d);
        res = a * x + b * y;

        // EXIBINDO O VALOR DE X E Y
        System.out.printf("x = %.2f\n", x);
        System.out.printf("y = %.2f\n", y);

        // EXIBINDO A RESPOSTA DE VERIFICAÇÃO
        System.out.println("Verificação: " + res);
    }

}
