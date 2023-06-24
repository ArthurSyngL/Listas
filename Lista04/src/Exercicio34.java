public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        System.out.println("Digite 10 números diferentes:");

        while (contador < 10) {
            int numero = sc.nextInt();

            if (numeroJaDigitado(numeros, numero)) {
                System.out.println("Número já digitado. Digite outro número:");
            } else {
                numeros[contador] = numero;
                contador++;
            }
        }

        System.out.println("Vetor final:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static boolean numeroJaDigitado(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
}