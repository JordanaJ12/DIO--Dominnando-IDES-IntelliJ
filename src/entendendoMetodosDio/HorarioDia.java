package entendendoMetodosDio;
/*A parti do horário selecionado, imprimir na tela a mensagem de bom dia, boa tarde, boa noite ou boa madrugada:*/

public class HorarioDia {

    public static void horaDia(int hora) {
    switch (hora){
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
            mensagemDia();
            break;
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
            mensagemTarde();
            break;
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        mensagemNoite();
        break;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
            mensagemMadrugada();
            break;
        default:
            System.out.println("Digite um horário válido, entre ás 0 e ás 23 horas!");

    }


    }

    private static void mensagemDia() {
        System.out.println("Bom dia!");
    }

    private static void mensagemTarde() {
        System.out.println("Boa Tarde!");
    }

    private static void mensagemNoite() {
        System.out.println("Boa Noite!");
    }

    private static void mensagemMadrugada() {
        System.out.println("Boa Madrugada!");
    }
}
