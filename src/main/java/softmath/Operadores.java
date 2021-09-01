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

    //revisado con exito
    public void crearPotencia(double base, double exponente ){
        if(base == 0 && exponente==0)
        {
            System.out.println("No se puede realizar una potenciación con ceros");
        }
        else
        {
            System.out.println(Math.pow(base,exponente));
        }
    }

}
