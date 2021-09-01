package softmath;

import java.util.Scanner;

public class Operadores {

    public void division(double num1, double num2){
        //validacion division entre cero
        if(num2==0)
        {
            System.out.println("No se puede dividir entre cero");
        }
        // método para dividir
        if(num2!=0)
        {
            System.out.println("El resultado de la división es: " + num1/num2);
        }
    }

    public static double crearPotencia(double base, double exponente ){
        return Math.pow(base,exponente);
    }

}
