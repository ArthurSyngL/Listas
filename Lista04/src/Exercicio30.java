/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Intersecao de 2 volumes
 */
import java.util.*;

public class Exercicio30 {
    public static void main(String[] args) {

        // Declaracao de vetor
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        // Leitura dos vetores
        System.out.println("Digite os elementos do vetor 1:");
        lerVetor(vetor1);

        System.out.println("Digite os elementos do vetor 2:");
        lerVetor(vetor2);

        // Criação do vetor de interseção
        int[] intersecao = encontrarIntersecao(vetor1, vetor2);

        // Impressão do vetor de interseção
        System.out.println("Elementos presentes nos dois vetores (interseção):");
        imprimirVetor(intersecao);
    }

    // Funcao para ler o Vetor
    public static void lerVetor(int[] vetor) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
    }

    // Funcao para encontrar a intersecao
    public static int[] encontrarIntersecao(int[] vetor1, int[] vetor2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> intersecaoList = new ArrayList<>();

        for (int i = 0; i < vetor1.length; i++) {
            set.add(vetor1[i]);
        }

        for (int i = 0; i < vetor2.length; i++) {
            if (set.contains(vetor2[i])) {
                intersecaoList.add(vetor2[i]);
                set.remove(vetor2[i]); // Evita elementos repetidos
            }
        }

        int[] intersecao = new int[intersecaoList.size()];
        for (int i = 0; i < intersecaoList.size(); i++) {
            intersecao[i] = intersecaoList.get(i);
        }

        return intersecao;
    }

    // Funcao para Exibir o calculo final
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
