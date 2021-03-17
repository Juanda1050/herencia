package T2;

public class Funciones2 extends Funciones1
{
    protected double W, N, A;

    protected void calcularW()
    {
        W = (Math.pow(Y,2) - Math.pow(X,4)) / Z;
        System.out.println("El valor de W es: "+W);
    }

    protected void calcularN()
    {
        N = (Math.pow(Z, 3) / (4 * Math.pow(C, 2))) - X;
        System.out.println("El valor de N es: "+N);
    }

    protected void calcularA()
    {
        A = Math.pow(B, 2) - Math.pow(C, 3);
        System.out.println("El valor de A es: "+A);
    }
}
