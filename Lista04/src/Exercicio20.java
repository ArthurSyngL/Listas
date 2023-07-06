/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Imprimas dois vetor em cada linha
 */
public class Exercicio20 {
    public static void main(String[] args) {

        // Declarando o vetor e as variaveis
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int contador = 0;

        // Calculando

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                vetor1[contador] = i;
                vetor2[contador] = i;
                contador++;
            }

            if (contador == 10) {
                break;
            }
        }

        // Exibindo o vetor

        System.out.println("Vetor 1:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println("\nVetor 2 (ímpares do vetor 1):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor2[i] + " ");
        }
    }
}
