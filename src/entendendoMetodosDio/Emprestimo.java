package entendendoMetodosDio;

import java.util.Scanner;

public class Emprestimo {
    public static void valorParcelado(){
        Scanner entrada = new Scanner(System.in);
        double valor, taxaJuros, numeroParcelas;

        System.out.print("Qual o valor do emprestimo? ");
        valor = entrada.nextDouble();

        System.out.print("Qual a taxa de juros? ");
        taxaJuros = entrada.nextDouble();

        System.out.print("Em quantas parcelas foram divididas? ");
        numeroParcelas = entrada.nextDouble();

        calculoParcelas(valor, taxaJuros, numeroParcelas);
    }

    private static void calculoParcelas(double valor, double taxaJuros, double numeroParcelas) {
        double calculoJuros= valor  * taxaJuros * numeroParcelas; // cálculo de juros simples


        System.out.println("O valor do empréstimo será de R$ " + calculoJuros);
    }
}
