package T2;

public class Funciones3 extends Funciones2
{
    protected double D, E;

    protected void calcularD()
    {
        D = (Math.pow(N, -2) + Math.pow(Y, 4)) / (Math.pow(W, 2) * Z);
        System.out.println("El valor de D es: "+D);
    }

    protected void calcularE()
    {
        E = (X / A) + L;
        System.out.println("El valor de E es: "+E);
    }
}
