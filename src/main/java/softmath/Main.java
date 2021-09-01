package softmath;
import javax.swing.*;
import java.util.Scanner;


public class Main {

    public static void menu(){
        System.out.println("**********CALCULADORA SOFKA************");
        System.out.println("1 - SUMAR \n2 - MULTIPLICAR \n3 - LOGARITMO \n4 - RAÍZ");
        System.out.println("5 - POTENCI \n6 - DIVISIÓN \n7 - RESTA \n8 - COSENO");
        System.out.println("9 - FACTORIAL \n10 - SENO \n11 - TERMINAR");
        System.out.println("Escoja una opción de las anteriores");
    }
    public static int metodoDe1Numero(Scanner teclado){

        System.out.println("Por favor ingresa un numero");
        int numero = teclado.nextInt();
        return numero;
    }

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        Operadores operadores = new Operadores();


        boolean entrar = true;
        while (entrar) {
            menu();
            int opcion = myObj.nextInt();
            if (opcion > 0 && opcion < 12) {
                // switch case
                switch (opcion){
                    //suma
                    case 1:
                        a = metodoDe1Numero(myObj);
                        b = metodoDe1Numero(myObj);
                        System.out.println("La suma es: " + operadores.suma(a,b));
                        break;
                    //Multiplicación
                    case 2:
                        a = metodoDe1Numero(myObj);
                        b = metodoDe1Numero(myObj);
                        System.out.println("La multiplicacion es: " + operadores.multiplicacion(a,b));
                        double a;
                        double b;
                        a = metodoDe1Numero(myObj);
                        b = metodoDe1Numero(myObj);
                        operadores.suma(a,b);
                        break;
                    //Multiplicación
                    case 2:
                        double a;
                        double b;
                        a = metodoDe1Numero(myObj);
                        b = metodoDe1Numero(myObj);
                        operadores.multiplicacion(a,b);
                        break;
                    //logaritmo
                    case 3:
                        a = metodoDe1Numero(myObj);
                        System.out.println("El logaritmo base 10 es: " + operadores.logaritmo(a));
                        break;
                    //Raiz
                    case 4:
                        a = metodoDe1Numero(myObj);
                        System.out.println("La raiz cuadrada es: " + operadores.raiz(a));
                        double a;
                        double b;
                        a = metodoDe1Numero(myObj);
                        b = metodoDe1Numero(myObj);
                        operadores.raiz(a,b);
                        break;
                    //Potencia
                    case 5:
                        double a;
                        double b;
                        a = metodoDe1Numero(myObj);
                        b = metodoDe1Numero(myObj);
                        System.out.println("La potencia es: " + operadores.crearPotencia(a,b));
                        break;
                    //
                    //División
                    case 6:
                        double a;
                        double b;
                        a = metodoDe1Numero(myObj);
                        b = metodoDe1Numero(myObj);
                        operadores.division(a,b);
                        break;
                    //Resta
                    case 7:
                        a = metodoDe1Numero(myObj);
                        b = metodoDe1Numero(myObj);
                        System.out.println("La resta es: " + operadores.resta(a,b));
                        break;
                    //Coseno
                    case 8:
                        a = metodoDe1Numero(myObj);
                        System.out.println("El coseno es: " + operadores.coseno(a));
                        break;
                    //Factorial
                    case 9:
                        int numero = metodoDe1Numero(myObj);
                        System.out.println("numero = " + numero);
                        break;
                    //Seno
                    case 10:
                        a = metodoDe1Numero(myObj);
                        System.out.println("El Seno es: " + operadores.seno(a));
                        break;
                    case 11:
                        entrar=false;
                        break;
                    default:
                        System.out.println("Ya dañaste todo");
                }
            }else{
                System.out.println("Opcion incorrecta");
            }
        }


    }

}
