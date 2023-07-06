/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando x e y
 */
import java.util.ArrayList;
import java.util.List;

public class Exercicio32 {
    public static void main(String[] args) {

        // Declarando Variaveis

        int[] x = {1, 2, 3, 4, 5}; // Vetor x
        int[] y = {4, 5, 6, 7, 8}; // Vetor y

        // Soma entre x e y
        int[] soma = new int[5];
        for (int i = 0; i < 5; i++) {
            soma[i] = x[i] + y[i];
        }

        // Produto entre x e y
        int[] produto = new int[5];
        for (int i = 0; i < 5; i++) {
            produto[i] = x[i] * y[i];
        }

        // Diferença entre x e y
        List<Integer> diferenca = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                diferenca.add(x[i]);
            }
        }

        // Interseção entre x e y
        List<Integer> intersecao = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    intersecao.add(x[i]);
                    break;
                }
            }
        }

        // União entre x e y
        List<Integer> uniao = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            uniao.add(x[i]);
        }
        for (int i = 0; i < 5; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                uniao.add(y[i]);
            }
        }

        // Mostrar os vetores resultantes
        System.out.print("Soma entre x e y: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println();

        System.out.print("Produto entre x e y: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(produto[i] + " ");
        }
        System.out.println();

        System.out.print("Diferença entre x e y: ");
        for (Integer num : diferenca) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Interseção entre x e y: ");
        for (Integer num : intersecao) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("União entre x e y: ");
        for (Integer num : uniao) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
