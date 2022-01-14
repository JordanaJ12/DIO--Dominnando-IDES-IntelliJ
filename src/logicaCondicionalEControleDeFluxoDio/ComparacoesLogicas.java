package logicaCondicionalEControleDeFluxoDio;
/*Crie um projeto simples no intelliJ e codificar os exemplos de
* operadores lógicos  para compreender -los. Utilize operandos e expressões.
*/

public class ComparacoesLogicas {
    public static void main(String[] args) {
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;
    boolean b4 = false;

        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 || b2 = " + (b1 || b2));
        System.out.println("b1 ^ b2 = " + (b1 ^ b2));
        System.out.println("!b1 = " + !b1);

        int i1 = 10;
        int i2 = 20;
        float f1 = 40.6f;
        boolean condicao1 = i2 < i1;
        boolean condicao2 = f1 > i2;
        boolean resultadoCondicoes = condicao1 || condicao2;
        System.out.println("i2 < i1 = " + condicao1);
        System.out.println("f1 > i2 = " + condicao2);
        System.out.println("Se i2 < i1 ou f1 > i2 = " + resultadoCondicoes);
    }
}
