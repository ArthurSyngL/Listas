/*
Aluno:Arthur Socrates Saavedra Lemos
Turma:2° Informatica
Tempo e velocidade km
 */
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        // DECLARAÇÃO DE VARIAVEIS

        double distanciaKm,velocidadeKmH,tempoH,velocidadeMS;
        int tempoMin,tempoSeg;

        //DECLARAR E INICIALIZAR A VARIAVEL INPUT - Pacote SCANNER

        Scanner input = new Scanner(System.in);

        // Entrada da distância em km
        System.out.print("Digite a distância entre os pontos em km: ");
        distanciaKm = input.nextDouble();

        // Entrada da velocidade em km/h
        System.out.print("Digite a velocidade em km/h: ");
        velocidadeKmH = input.nextDouble();

        // Cálculo do tempo em horas
        tempoH = distanciaKm / velocidadeKmH;

        // Cálculo do tempo em minutos e segundos
        tempoMin = (int) (tempoH * 60);
        tempoSeg = (int) ((tempoH * 3600) % 60);

        // Cálculo da velocidade em m/s
        velocidadeMS = velocidadeKmH * 1000 / 3600;

        // Saída do tempo médio e da velocidade em m/s
        System.out.println("Tempo médio de viagem: " + tempoMin + "min e " + tempoSeg + "seg");
        System.out.println("Velocidade em m/s: " + velocidadeMS);
    }
}
