package softmath;

import java.util.Scanner;

public class Operadores {

    // método para dividir
    public void division(double num1, double num2){
        System.out.println("El resultado de la división es: " + num1/num2);
    }

    public static double crearPotencia(double base, double exponente ){
        return Math.pow(base,exponente);
    }

}
