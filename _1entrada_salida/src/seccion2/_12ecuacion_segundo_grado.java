package seccion2;

import java.util.Scanner;

public class _12ecuacion_segundo_grado {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        double a,b,c,d,e;

        System.out.println("ingresa el valor de a: ");
        a = entrada.nextFloat();

        System.out.println("ingresa el valor de b:");
        b = entrada.nextFloat();

        System.out.println("ingresa el valor de c:");
        c = entrada.nextFloat();

        d = (-b+(Math.sqrt(b*b-4*a*c)))/2*a;
        e = (-b-(Math.sqrt(b*b-4*a*c)))/2*a;
        System.out.println("el resultado de la chicharronera es:"+d);
        System.out.println("el resultado de la chicharronera es:"+e);

    }
}
