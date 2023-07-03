public class Exercicio37 {
        public static void main(String[] args) {
                int[] vetor = {1, 2, 3, 4, 5, 6, 11, 10, 9, 8, 7};

                // Imprimir vetor original
                System.out.println("Vetor original:");
                imprimirVetor(vetor);

                // Ordenar o vetor em ordem crescente até o sexto elemento
                for (int i = 0; i < 6; i++) {
                        for (int j = i + 1; j < 6; j++) {
                                if (vetor[i] > vetor[j]) {
                                        int temp = vetor[i];
                                        vetor[i] = vetor[j];
                                        vetor[j] = temp;
                                }
                        }
                }

                // Ordenar o vetor em ordem decrescente a partir do sétimo elemento
                for (int i = 6; i < vetor.length; i++) {
                        for (int j = i + 1; j < vetor.length; j++) {
                                if (vetor[i] < vetor[j]) {
                                        int temp = vetor[i];
                                        vetor[i] = vetor[j];
                                        vetor[j] = temp;
                                }
                        }
                }

                // Imprimir vetor ordenado
                System.out.println("Vetor ordenado:");
                imprimirVetor(vetor);
        }

        // Funcao para Imprimir o Vetor
        public static void imprimirVetor(int[] vetor) {
                for (int i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i] + " ");
                }
                System.out.println();
        }
}
