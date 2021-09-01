package softmath;

import java.util.Scanner;

public class Operadores {

    public static double crearPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Este es un metodo que recive un double y calcula el logaritmo de ducho numero, en caso de recivir un negativo retorna 0
     * @param double
     * @return Este es un metodo retorna un double.
     */
    public static double crearlogaritmo(double base){
        if (base >0){
            return Math.log(base);
        }
        return 0;
    }


    public static double raizCuadrada(double radicando) {
        return Math.sqrt(radicando);
    }

}
