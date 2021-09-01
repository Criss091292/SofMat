package softmath;

import java.util.Scanner;

public class Operadores {

    public static double crearPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static double crearlogaritmo(double base){
        if (base >0){
            return Math.log(base);
        }
        return 0;
    }

    public static double raizCuadrada(double radical, double radicando) {
        return 0;
    }

}
