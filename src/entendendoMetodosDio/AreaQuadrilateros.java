package entendendoMetodosDio;

/* Cria uma aplicação  que calcula a área dos 3 quadriláteros notáveis: quadrado, retÂngulo e trapézio.
 * OBS: utilize a sobrecarga.
 *
 * */

public class AreaQuadrilateros {

    public static double area(double valor) {
        double areaQuadrado = valor * valor; // cálculo da área de um quadrado

        return areaQuadrado;
    }

    public static double area(double altura, double largura) {
        double areaRetangulo = altura * largura; // cálculo da área de um retângulo

        return areaRetangulo;
    }

    public static double area(double baseMaior, double baseMenor, double altura ) {
        double areaTrapezio = ((baseMaior + baseMenor) * altura) / 2; // cálculo da área de um trapézio
       return areaTrapezio;
    }

}
