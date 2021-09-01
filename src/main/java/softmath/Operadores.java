package softmath;

import java.util.Scanner;

public class Operadores {

    public static double Potencia(double base, double exponente ){
        return Math.pow(base,exponente);
    }

    /**
     * Método para realizar la suma de dos números decimales
     * @author  Nataly Mora
     * @param num1 primer número a sumar
     * @param num2 segundo número a sumar
     * @return la suma de num1 y num2
     */
    public static double Suma(double num1, double num2 ){
        return num1+num2;
    }

    /**
     * Método para realizar la multiplicación de dos números decimales
     * @author  Nataly Mora
     * @param num1 primer número a multiplicar
     * @param num2 segundo número a multiplicar
     * @return el producto de num1 y num2
     */
    public static double Multiplicacion(double num1, double num2 ){return num1*num2;}

}
