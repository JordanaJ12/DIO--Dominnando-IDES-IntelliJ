package entendendoMetodosDio;
/*Calcular as quatro operações básicas: soma, subtração, multiplicação e divisão.
/* Sempre 2 valores devem ser passados.
*/

import java.util.Scanner;

public class Calculadora {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        float valor1, valor2;
        int operacao;

        System.out.print("Digite o primeiro valor: ");
        valor1 = entrada.nextFloat();

        System.out.print("Digite o segundo valor: ");
        valor2 = entrada.nextFloat();

        System.out.println("Escolha a operação que deseja ser efetuada:");
        System.out.println("1- Adição\n2- Subtração\n3- Multiplicação\n4- Divisão");
        operacao = entrada.nextInt();

        switch (operacao) {
            case 1:
                adicao(valor1, valor2);

                break;
            case 2:
                subtracao(valor1, valor2);
                break;
            case 3:
                multiplicacao(valor1, valor2);
                break;
            case 4:
                divisao(valor1, valor2);
                break;
            default:
                System.out.println("Escolha valores entre as opções!");

        }

    }


    public static void adicao(float valor1, float valor2) {
        float soma = valor1 + valor2;
        System.out.printf("Resultado de %.1f + %.1f = %.1f", valor1, valor2, soma);
    }

    public static void subtracao(float valor1, float valor2) {
        float subtracao = valor1 - valor2;
        System.out.printf("Resultado de %.1f - %.1f = %.1f", valor1, valor2, subtracao);
    }

    public static void multiplicacao(float valor1, float valor2) {
        float multiplicacao = valor1 * valor2;
        System.out.printf("Resultado de %.1f * %.1f = %.1f", valor1, valor2, multiplicacao);
    }

    public static void divisao(float valor1, float valor2) {
        float divisao = valor1 / valor2;
        System.out.printf("Resultado de %.1f / %.1f = %.1f", valor1, valor2, divisao);
    }

}
