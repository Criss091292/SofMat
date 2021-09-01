package softmath;

import java.util.Scanner;

public class Operadores {

    public static double crearPotencia(double base, double exponente ){
        return Math.pow(base,exponente);
    }

    public static double crearCoseno(double angulo){
        return Math.cos(Math.toRadians(angulo));
    }
}
