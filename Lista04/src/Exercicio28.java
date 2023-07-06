/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Elemento v1 e v2
 */
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner sc = new Scanner(System.in);

        // Declaracao vetor e variaveis

        int[] v = new int[10];
        int[] vl = new int[10];
        int[] v2 = new int[10];
        int vlIndex = 0, v2Index = 0;

        // Recebendo os Vetores

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();

            if (v[i] % 2 == 0) {
                v2[v2Index] = v[i];
                v2Index++;
            } else {
                vl[vlIndex] = v[i];
                vlIndex++;
            }
        }

        // Calculando e Exibindo

        System.out.println("Elementos UTILIZADOS de vl:");
        for (int i = 0; i < vlIndex; i++) {
            System.out.println(vl[i]);
        }

        System.out.println("Elementos UTILIZADOS de v2:");
        for (int i = 0; i < v2Index; i++) {
            System.out.println(v2[i]);
        }
    }
}
