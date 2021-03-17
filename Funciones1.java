package T2;

import java.util.Scanner;

public class Funciones1
{
    protected double B, C, L;
    protected double X, Y, Z;

    protected void leerValores()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de B: ");
        B = sc.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        C = sc.nextDouble();
        System.out.print("Ingrese el valor de L: ");
        L = sc.nextDouble();
    }

    protected void calcularX()
    {
        X = Math.pow(B, 2) + Math.pow(C, 3);
        System.out.println("El valor de X es: "+X);
    }

    protected void calcularY()
    {
        Y = ((0.5d)*Math.pow(X, 2) - Math.pow(B, 4)) / Math.pow(C,2);
        System.out.println("El valor de Y es: "+Y);
    }

    protected void calcularZ()
    {
        Z = (Math.pow(X, 2) / Math.pow(Y, 4)) + B;
        System.out.println("El valor de Z es: "+Z);
    }
}
