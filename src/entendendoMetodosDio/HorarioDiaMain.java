package entendendoMetodosDio;

import java.util.Scanner;

public class HorarioDiaMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora;

        System.out.println("Digite as horas do dia: ");
        hora = entrada.nextInt();

        HorarioDia.horaDia(hora);
    }
}
