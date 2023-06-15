/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Calculando a dosegem e a quantidade de gotas
 */
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {

        // Declaração de Variaveis

        int idade, gotasPorDose;
        double peso, dosagem;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner scanner = new Scanner(System.in);

        // DADOS RECEBIDOS

        System.out.print("Informe a idade do paciente: ");
        idade = scanner.nextInt();
        System.out.print("Informe o peso do paciente (em quilos): ");
        peso = scanner.nextDouble();

        // MANDANDO OS DADOS PARA AS FUNÇÕES

        dosagem = calcularDosagem(idade, peso);
        gotasPorDose = calcularGotasPorDose(dosagem);

        // EXIBINDO O RESULTADO DEPOIS DA FUNÇÃO

        System.out.println("A dosagem a ser administrada é de " + dosagem + " mg por dose.");
        System.out.println("Isso equivale a " + gotasPorDose + " gotas por dose.");
    }

    // FUNÇÃO PARA CALCULAR A DOSAGEM DE ACORDO COM O PESO E A IDADE
    public static double calcularDosagem(int idade, double peso) {
        if (idade >= 12) {
            if (peso >= 60) {
                return 1000;
            } else {
                return 875;
            }
        } else {
            if (peso < 5) {
                return 0;
            } else if (peso < 10) {
                return 125;
            } else if (peso < 15) {
                return 187.5;
            } else if (peso < 25) {
                return 250;
            } else if (peso < 35) {
                return 375;
            } else if (peso < 50) {
                return 500;
            } else {
                return 750;
            }
        }
    }

    // FUNÇÃO PARA CALCULAR AS GOTAS POR DOSE
    public static int calcularGotasPorDose(double dosagem) {
        double mlPorDose = dosagem / 500;
        int gotasPorDose = (int) Math.round(mlPorDose * 20);
        return gotasPorDose;
    }
}
