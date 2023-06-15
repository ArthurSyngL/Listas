/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Pesquisa entre habitantes salarios
 */
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int id, maior=0,menor=0, i =0,qtd = 0, menorid = 0;
        String sex, menorsex="";
        double sal, m = 0, menorsal = 0;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // REPETICAO

        while(true){

            // RECEBENDO OS DADOS

            System.out.println("Idade: ");
            id = input.nextInt();
            System.out.println("Sexo: M(masculino) / F(feminino): ");
            sex = input.next();
            System.out.println("Salario: ");
            sal = input.nextDouble();

            // IDADE FOR MENOR QUE 0 PARA O WHILE

            if(id < 0){
                break;
            }

            // CALCULANDO A MEDIA E, MAIOR MENOR IDADE, QUANTIDADE, E A IDADE E O SEXO DA PESSOA COM O MENOR SALARIO

            if(i == 0){
                maior = id;
            }else if(id > maior){
                maior = id;
            }
            if(i == 0){
                menor = id;
            }else if(id < menor){
                menor = id;
            }


            if(sex.equals("F")){
                if(sal <= 200){
                    qtd =qtd+1;
                }
            }


            if(i == 0){
                menorsal = sal;
                menorsex = sex;
                menorid = id;
            }else if(sal < menorsal){
                menorsal = sal;
                menorsex = sex;
                menorid = id;
            }

            m += sal;
            i =i+1;

        }

        // EXIBIMENTO FINAL

        System.out.println("Media dos salarios: "+m / i);
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("Qtd: "+qtd);
        System.out.println("Idade menor salario: "+menorid);
        System.out.println("Sexo menor salario: "+menorsex);
    }
}
