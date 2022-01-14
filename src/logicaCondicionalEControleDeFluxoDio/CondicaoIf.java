package logicaCondicionalEControleDeFluxoDio;
/*Com if, exiba o nome do mês do ano de acordo com seu numero. Evite o efeito
"flecha". Faça também putro if que verifique se o mês é julho, dezembro ou janeiro, para assim exibir o texto "Férias".
*/


import java.util.Scanner;

public class CondicaoIf {
    static Scanner entrada = new Scanner(System.in); // variavel global

    public static void main(String[] args) {
        mesAno();
        mesFerias();
    }

    public static void mesAno(){ //verifica o mês de aniversário através do número do mês

        System.out.print("Qual o número do seu mês de aniversário? ");
        int mesAniversario = entrada.nextInt();

        if(mesAniversario == 1){
            System.out.println("Seu mês de aniversáro é em Janeiro.");
        }else if(mesAniversario == 2){
            System.out.println("Seu mês de aniversário é em Fevereiro.");
        }else if(mesAniversario == 3){
            System.out.println("Seu mês de aniversário é em Março.");
        }else if(mesAniversario == 4){
            System.out.println("Seu mês de aniversário é em Abril.");
        }else if(mesAniversario == 5){
            System.out.println("Seu mês de aniversário é em Maio.");
        }else if(mesAniversario == 6){
            System.out.println("Seu mês de aniversário é em Junho.");
        }else if(mesAniversario == 7){
            System.out.println("Seu mês de aniversário é em Julho.");
        }else if(mesAniversario == 8){
            System.out.println("Seu mês de aniversário é em Agosto.");
        }else if(mesAniversario == 9){
            System.out.println("Seu mês de aniversário é em Setembro.");
        }else if(mesAniversario == 10){
            System.out.println("Seu mês de aniversário é em Outubro.");
        }else if(mesAniversario == 11){
            System.out.println("Seu mês de aniversário é em Novembro.");
        }else if(mesAniversario == 12){
            System.out.println("Seu mês de aniversário é em Dezembro.");
        }else{
            System.out.println("O valor escrito não é válido!");
        }
    }

    public static void mesFerias(){ // verificar se o mês digitado é um periodo de férias
        System.out.print("\nDigite um mês(Exemplo: Janeiro, Fevereiro..): " );
        String mesFerias = entrada.next().toLowerCase();

        if(mesFerias.equalsIgnoreCase("Janeiro")){
            System.out.println("Este mês é periodo de férias!");

        }else if(mesFerias.equalsIgnoreCase("Julho")) {
            System.out.println("Este mês é periodo de férias!");

        }else if(mesFerias.equalsIgnoreCase("Dezembro")) {
            System.out.println("Este mês é periodo de férias!");

        }else{
            System.out.println("Este mês não é periodo de férias!");
        }


    }
}
