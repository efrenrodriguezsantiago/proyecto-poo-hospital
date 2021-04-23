package seccion2;

import java.util.Scanner;

public class _11horas {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        /*
        *construir un programa que dado un numero total de horas
        * devuelve el numero de semanas dias y horas equivalentes
        * por ejemplo dado un total de 1000 horas debe mostrar 5 semanas 6 dias y16 horas
        */
        //se divide con la funcion de RESTO
        float semana,dia,hora,equivalente,total,resto,operacion;

        System.out.println("ingresa la hora a calcular: ");
        total = entrada.nextFloat();

        semana = total / 168;
        dia = total %168/24;
        hora = total % 24;

        System.out.println("el resultado es:");
        System.out.println("semana: "+semana);
        System.out.println("dia: "+dia);
        System.out.println("hora: "+hora);

    }
}
