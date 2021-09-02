import java.util.Scanner;
public class Operadores {
    private static int factorial(int num) {

        // Definición de factorial para n >= 0 entero positivo
        if (num==1 || num ==0) {
            return 1;
        } else
            return num * factorial(num - 1);
    }

    public double seno(double num1) {
        try {
            //double b = ;
        } catch (Exception e) {
            System.out.println("ERROR: Datos incorrectos.");
        }
        return Math.sin(Math.toRadians(num1));
    }

}


