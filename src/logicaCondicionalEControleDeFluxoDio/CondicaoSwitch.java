package logicaCondicionalEControleDeFluxoDio;

import java.util.Scanner;

/*Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch, faça outro exemplo onde, se
 uma variável inteira for entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado", se for 5 "Talvez". Para demais valores exibir
"Valor indefinido".
* */
public class CondicaoSwitch {
    static Scanner entrada = new Scanner(System.in); //variavel global utilizada para a classe inteira.

    public static void main(String[] args) {
        diaSemana();
        numeroCerto();
    }

    public static void diaSemana() { // verifica o número do dia da semana
        String diaSemana;
        System.out.print("Digite o dia da semana(ex: Segunda, Terça..): ");
        diaSemana = entrada.next();

        switch (diaSemana.toLowerCase()) {
            case "segunda":
                System.out.println("O número correspondente a Segunda é o número 2.");
                break;
            case "terça":
            case "terca":
                System.out.println("O número correspondente a Terça-feira é o número 3.");
                break;
            case "quarta":
                System.out.println("O número correspondente a Quarta-feira é o número 4 .");
                break;
            case "quinta":
                System.out.println("O número correspondente a Quinta-feira é o número 5.");
                break;
            case "sexta":
                System.out.println("O número correspondente a Sexta-feira é o número 6.");
                break;
            case "sábado":
            case "sabado":
                System.out.println("O número correspondente a Sabado é o número 7.");
                break;
            case "domingo":
                System.out.println("O número correspondente a Domingo é o número 1.");
                break;
            default:
                System.out.println("O dia da semana não é válido!");
                break;
        }
    }

    public static void numeroCerto(){
        int numeroDigitado;
        System.out.print("\nDigite um número de 1 a 5:");
        numeroDigitado = entrada.nextInt();

        switch (numeroDigitado){
            case 1://caso o número digitado seja 1,2 ou 3 printar na tela a mensagem:
            case 2:
            case 3:
                System.out.println("Número Correto!");
                        break; // interromper o switch
            case 4:
                System.out.println("Número Errado!");
                break;
            case 5:
                System.out.println("Talvez seja um número certo, ou não!");
                break;
            default:
                System.out.println("Número Indefinido!");
        }
    }

}
