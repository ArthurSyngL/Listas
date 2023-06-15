/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Armazenar 6 numeros interios
 */
public class Exercicio01 {
    public static void main(String[] args) {

        // Declaração de Variaveis e Declarando o vetor

        int[] A = new int[6];
        int soma;

        // Atribuindo o valor para cada um vetor

        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;

        // Somando e mostrando a imagem

        soma = A[0] + A[1] + A[5];
        System.out.println("Soma:" + soma);

        // Atribuindo 100 para o vetor 4

        A[4] = 100;

        // Exibindo o valor de todos os vetores

        for (int i =0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }
}
