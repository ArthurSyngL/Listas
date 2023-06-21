import java.util.ArrayList;
import java.util.List;

public class Exercicio32 {
    public static void main(String[] args) {
        int[] r = {1, 2, 3, 4, 5}; // Vetor r
        int[] y = {4, 5, 6, 7, 8}; // Vetor y

        // Soma entre r e y
        int[] soma = new int[5];
        for (int i = 0; i < 5; i++) {
            soma[i] = r[i] + y[i];
        }

        // Produto entre r e y
        int[] produto = new int[5];
        for (int i = 0; i < 5; i++) {
            produto[i] = r[i] * y[i];
        }

        // Diferença entre r e y
        List<Integer> diferenca = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 5; j++) {
                if (r[i] == y[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                diferenca.add(r[i]);
            }
        }

        // Interseção entre r e y
        List<Integer> intersecao = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (r[i] == y[j]) {
                    intersecao.add(r[i]);
                    break;
                }
            }
        }

        // União entre r e y
        List<Integer> uniao = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            uniao.add(r[i]);
        }
        for (int i = 0; i < 5; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 5; j++) {
                if (r[i] == y[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                uniao.add(y[i]);
            }
        }

        // Mostrar os vetores resultantes
        System.out.print("Soma entre r e y: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println();

        System.out.print("Produto entre r e y: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(produto[i] + " ");
        }
        System.out.println();

        System.out.print("Diferença entre r e y: ");
        for (Integer num : diferenca) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Interseção entre r e y: ");
        for (Integer num : intersecao) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("União entre r e y: ");
        for (Integer num : uniao) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
