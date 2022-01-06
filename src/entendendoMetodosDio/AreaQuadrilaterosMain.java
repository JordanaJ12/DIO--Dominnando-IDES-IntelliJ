package entendendoMetodosDio;

/* Cria uma aplicação  que calcula a área dos 3 quadriláteros notáveis: quadrado, retÂngulo e trapézio.
 * OBS: utilize a sobrecarga.
 *
 * */

public class AreaQuadrilaterosMain {
    public static void main(String[] args) {

        // para chamar a classe e o método em outro arquivo,java usa -se nome_da_classe.nome_do_método
        AreaQuadrilateros.area(4);
        AreaQuadrilateros.area(5, 2);
        AreaQuadrilateros.area(5, 3,2);
    }
}
