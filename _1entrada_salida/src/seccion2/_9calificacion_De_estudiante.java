package seccion2;

import java.util.Scanner;

public class _9calificacion_De_estudiante {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        /**
         * la calificacion final de un estudiante de informatica se calcula con base a las calificaciones de 4 aspectos
         * de su rendimiento academico
         * participacion
         * primer parcial
         * segundo parcial
         * tercer parcial
         * sabiendo que las calificaciones anteriores entran a la calificacion final  con pnderacion del
         * 10 % 25 % 25% 40%
         * hacer un programa que calcule e imprima la calificacion final obtenida por un estudinte
         */
        float participacion,cal1,cal2,cal_final,resultado,califica1,califica2,califica3,califica4,promedio,n;

        System.out.println("ingresa la participacion: ");//28 puntos de 28 es = a 100
        participacion = entrada.nextFloat();
        participacion *= 0.10f;

        System.out.println("ingresa la primera calificacion: ");//28 puntos de 28 es = a 100
        cal1 = entrada.nextFloat();
        cal1 *= 0.25;

        System.out.println("ingresa la segunda calificacion: ");//28 puntos de 28 es = a 100
        cal2 = entrada.nextFloat();
        cal2 *= 0.25;

        System.out.println("ingresa la calificacion final: ");//28 puntos de 28 es = a 100
        cal_final = entrada.nextFloat();
        cal_final *= 0.25;

        n = participacion + cal1 + cal2 + cal_final;

        System.out.println("el promedio es: "+n);
    }
}
