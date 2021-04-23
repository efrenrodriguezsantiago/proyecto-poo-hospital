package seccion9;

import java.util.Scanner;

public class _1area {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lado,area,perimetro;
        String unidad;

        System.out.println("area y perimetro de un cuadrado ");
        System.out.println("ingresa el lado 1");
        lado = entrada.nextDouble();

        System.out.println("ingresa la medida de su cuadrado");
        unidad = entrada.next();

        area = lado * lado;
        perimetro = lado * 4;

        System.out.println("el area de un cuadrado es: "+area+unidad);
        System.out.println("el perimetro del cuadrado es: "+perimetro+unidad);


    }
}
