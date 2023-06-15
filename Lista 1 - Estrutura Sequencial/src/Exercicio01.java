/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Media ponteirada
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        double n1, n2, n3,n4, mp;
        int p1=1, p2=2, p3=3, p4=4;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // DADOS RECEBIDOS NOTAS

        System.out.println("Informe as notas");
        n1 = input.nextDouble();

        System.out.println("Informe as notas");
        n2 = input.nextDouble();

        System.out.println("Informe as notas");
        n3 = input.nextDouble();

        System.out.println("Informe as notas");
        n4 = input.nextDouble();

        // CALCULANDO A MEDIA PONDERADA

        mp=((n1*p1)+(n2*p2)+(n3*p3)+(n4*p4))/(p1+p2+p3+p4);

        // EXIBIÇÃO DA MEDIA

        System.out.println("A media pondeirada e:"+ mp);
    }
}