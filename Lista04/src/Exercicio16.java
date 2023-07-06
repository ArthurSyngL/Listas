/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Numero diferentes exibie mensagem
 */
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        // Declarando o vetor e variaveis

        double[] vetor = new double[5];
        int codigo;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // Recebendos os valores
        System.out.println("Digite 5 valores reais:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Digite um código (0, 1 ou 2):");
        codigo = scanner.nextInt();

        // Calculando e exibindo

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
