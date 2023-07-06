/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Sao primos
 */
public class Exercicio27 {
    public static void main(String[] args) {

        // Declarando o vetor

        int[] vetor = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        // Recebendo e Exibindo
        System.out.println("Números primos encontrados:");
        for (int i = 0; i < 10; i++) {
            boolean primo = true;
            for (int j = 2; j < vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("Número: " + vetor[i] + ", Posição: " + i);
            }
        }
    }
}
