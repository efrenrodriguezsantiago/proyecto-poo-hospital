package seccion2;

import java.util.Scanner;

public class _7cantidad_de_dinero {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        /*
        * Guillermo tene N dolares
        * Luis tiene la mitad de loq eue poseen Guillermo
        * Juan tiene la mitadde lo que posee Luis y guillermo juntos
        * hacer un programa que calcule e imprima la cantidad de dinero
        * que tienen entre los tres
        * */

        float guillermo,juan,luis,dinero,total;

        System.out.println("digite la cantidad de dinero que posee guillermo: ");
        guillermo = entrada.nextFloat();

        luis = guillermo / 2;
        System.out.println("el dinero de guillermo es: "+guillermo);
        System.out.println("el dinero de luis es: "+luis);
        juan = (guillermo + luis)/2;
        System.out.println("el dinero de juan es: "+juan);

        total = juan+luis+guillermo;

        System.out.println("el dinero total es: "+total);
    }
}
