import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        int[] valores = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < 6; i++) {
            valores[i] = scanner.nextInt();
        }

        System.out.println("Valores lidos na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}

