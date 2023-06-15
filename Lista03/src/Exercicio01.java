/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Numero divido por 11, produzam o resto de 5
 */
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int i;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // CALCULANDO E EXIBINDO

        for (i = 1000; i <= 2000; i++) {
            if (i % 11 == 5) {
                System.out.println(+i);
            }
        }
    }
}
