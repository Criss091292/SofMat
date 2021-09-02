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

  

    public Operadores() {

    }
        // Prueba realizada
    public void division(double num1, double num2){
        //validacion division entre
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

        

    public static double Resta(double nro1, double nro2) {
        return (nro1 - nro2);
    }

    public static double Coseno(double angulo){
        return Math.cos(Math.toRadians(angulo));

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
