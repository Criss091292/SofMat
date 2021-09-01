package softmath;

import java.util.Scanner;

public class Operadores {

    public static double crearPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Este es un metodo que recive un double y calcula el logaritmo de ducho numero, en caso de recivir un negativo retorna 0
     * @param base double
     * @return Este es un metodo retorna un double.
     */
    public static double crearlogaritmo(double base){
        if (base >0){
            return Math.log(base);
        }
        return 0;
    }


    /**
     * Este es un metodo que recibe una variable tipo double.
     * @param radicando double
     * @return retorna la raiz cuadrada de dicha variable.
     */
    public static double raizCuadrada(double radicando) {
        return Math.sqrt(radicando);
    }

}
