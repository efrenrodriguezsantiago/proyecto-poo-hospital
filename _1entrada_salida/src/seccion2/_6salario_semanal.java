package seccion2;

import java.util.Scanner;

public class _6salario_semanal {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        /*
        hacer un programa que calcule e imprima
        el salario semanal de un empleado
        a partir de sus horas semanales trabajadas y de su salario por hora
         */
    float hora_salario,hora_semanal,salario;

        System.out.println("digite el salario de la hora : ");
        hora_salario = entrada.nextFloat();
        System.out.println("digite las horas trabajadas: ");
        hora_semanal = entrada.nextFloat();

        salario = hora_salario * hora_semanal;

        System.out.println("el salario total es de: "+salario);

    }
}
