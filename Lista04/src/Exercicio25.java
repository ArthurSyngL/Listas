public class Exercicio25 {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        int contador = 0;

        for (int i = 0; contador < 100; i++) {
            if (i % 7 != 0 && i % 10 != 7) {
                vetor[contador] = i;
                contador++;
            }
        }

        System.out.println("Vetor com os 100 primeiros naturais não múltiplos de 7 ou que terminam com 7:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
