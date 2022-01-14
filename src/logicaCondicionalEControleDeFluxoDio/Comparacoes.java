package logicaCondicionalEControleDeFluxoDio;
/*Criar um simples Projeto no IntelliJ para realizar  as comparações  com lógicas relacionais, além de utilizar
*os demais tipos de dados  não apresentados.
* */

public class Comparacoes {
    public static void main(String[] args) {
        int i1 = 10;
        int i2= 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "fulano";
        String s2 = "fulano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 2323L;
        long l2 = 2124L;
        double d1 = 32D;
        short sh1 = 21;
        byte  by1= 2;

        System.out.println("i1 > i2 = " + (i1 > i2));
        System.out.println("i1 < i2 = " + (i1 < i2));
        System.out.println("s1 == s2 = " + (s1 == s2));
       // System.out.println("s1 > s2 = " + (s1 > s2)); Por ser String não se pode comparar se um é maior que o outro, pois são operadores textuais,
        System.out.println("f1 != f2 = " + (f1 != f2));
        System.out.println("c1 == c2 = " + (c1 == c2));
        System.out.println("b1 != b2 = " + (b1 != b2));
      //  System.out.println("b1 > b2 = " + (b1 > b2)); // dará erro de compilação, pois são tipos booleanos e não números.
        System.out.println("l1 >= d1 =" + (l1 >= d1) );
        System.out.println("l1 <= l2 =" + (l1 <= l2) );
        System.out.println("by1 <= sh1 =" + (by1 <= sh1) );


    }
}
