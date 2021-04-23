package seccion2;

import java.util.Scanner;

public class _8salario_vendedor {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        /*
        *una campaña de venta de carros usados
        * paga su personal de ventas su salario de 1000 mensuales
        * mas una comision de 150 por cada carro vendido
        *
        * mas el 5 % del valor de la venta por carro
        * cada mes el capturista de la empresa ingresa en la computadora los datos pertientes
        * hacer un programa que calcule e imprina el salario mensual de un vendedor dado.
        */
        float mensual,precio,carro,porcentaje,salario,total,subtotal,ganancia;

        System.out.println("ingresa el salario mensual del vendedor:");//1000 mensuales
        mensual = entrada.nextFloat();
        System.out.println("ingresa el precio del carro:");//1200 precio de carro
        precio = entrada.nextFloat();
        System.out.println("ingresa la cantidad de carros vendidos:");//carro vendido cantidad
        carro = entrada.nextFloat();

        total = mensual +(carro*150);

        subtotal = (0.05f * precio * carro);

        ganancia = total +subtotal;

        System.out.println("el salario mensual es: "+ganancia);

    }
}
