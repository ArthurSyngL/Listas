import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        double[] vetor = new double[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 valores reais:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Digite um código (0, 1 ou 2):");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 0:
                System.out.println("Programa finalizado.");
                break;
            case 1:
                System.out.println("Vetor na ordem direta:");
                for (int i = 0; i < 5; i++) {
                    System.out.println(vetor[i]);
                }
                break;
            case 2:
                System.out.println("Vetor na ordem inversa:");
                for (int i = 4; i >= 0; i--) {
                    System.out.println(vetor[i]);
                }
                break;
            default:
                System.out.println("Código inválido.");
        }
    }
}
