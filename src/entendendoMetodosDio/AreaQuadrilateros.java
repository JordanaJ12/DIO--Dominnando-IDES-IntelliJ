package entendendoMetodosDio;

/* Cria uma aplicação  que calcula a área dos 3 quadriláteros notáveis: quadrado, retÂngulo e trapézio.
 * OBS: utilize a sobrecarga.
 *
 * */

public class AreaQuadrilateros {

    public static void area(double valor) {
        double areaQuadrado = valor * valor; // cálculo da área de um quadrado
        System.out.println("A área do quadrado é " + areaQuadrado);
    }

    public static void area(double altura, double largura) {
        double areaRetangulo = altura * largura; // cálculo da área de um retângulo
        System.out.println("A área do retângulo é + " + areaRetangulo);
    }

    public static void area(double baseMaior, double baseMenor, double altura ) {
        double areaTrapezio = ((baseMaior + baseMenor) * altura) / 2; // cálculo da área de um trapézio
        System.out.println("A área do trapézio é " + areaTrapezio);
    }

}
