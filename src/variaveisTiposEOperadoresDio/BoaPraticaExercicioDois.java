package variaveisTiposEOperadoresDio;

public class BoaPraticaExercicioDois {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 60000; valor muito acima do limite permitido pelo tipo.

       // int i1 =100000000000; valor acima do limite do permitido pelo tipo de dado.
        int i2 = 28500;

       // long l1 = 100000000000; é necessário colocar L no final para que o programa entenda que é LOng e não int
        long l2 = 20040050005500L;

       // float f1 = 4.5; é necessário colocar F no final para que o programa entenda que é float não double
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.84;

        char c1 = 'W';
      //char c2 = 'Tw'; não pode ter mais de um caractere no tipo de dado char
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "Uma frase longa podendo ser escrita";

        String dt1 = "09/02/2019";

        boolean bo1 = true;
        boolean bo2 =  false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
