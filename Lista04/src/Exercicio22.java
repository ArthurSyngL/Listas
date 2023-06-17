public class Exercicio22 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < 10; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = 10 - i;
        }

        for (int i = 0; i < 10; i++) {
            vetorC[2 * i] = vetorA[i];
            vetorC[2 * i + 1] = vetorB[i];
        }

        System.out.println("Vetor C (pares do vetor A e ímpares do vetor B):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
