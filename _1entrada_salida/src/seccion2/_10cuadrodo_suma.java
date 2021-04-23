package seccion2;

import java.util.Scanner;

public class _10cuadrodo_suma {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
    //hacer u programa que calcule el cuadrado de una suma

    float a,b,c,d;

        System.out.println("digite el numero a");
        a = entrada.nextFloat();

        System.out.println("digite el numero b");
        b = entrada.nextFloat();

        c = (a*a) + (b*b) + (2 * a *b);
        System.out.println("la respuesta es: "+c);
    }
}
