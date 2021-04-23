package seccion2;

import java.util.Scanner;

public class _5suma_de_tres_notas {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        /*
        * hace un programa que calcule e imprima la suma de tres calificaciones
        * */
        float calificacion1,calificacion2,calificacion3,resultado;

        System.out.println("digite la calificacion 1: ");//guarda cadena con
        calificacion1 = entrada.nextFloat();
        System.out.println("digite la calificacion 2: ");//guarda cadena con
        calificacion2 = entrada.nextFloat();
        System.out.println("digite la calificacion 3: ");//guarda cadena con
        calificacion3 = entrada.nextFloat();

        resultado = calificacion1 + calificacion2 +calificacion3;//resultado de tres calificaciones

        System.out.println("el resultado de la calificacion es: "+resultado);

    }
}
