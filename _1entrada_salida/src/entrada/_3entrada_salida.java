package entrada;

import java.util.Scanner;

public class _3entrada_salida {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        String cadena;//declara
        System.out.println("digite la cadena: ");//guarda cadena con todo y espacio
        cadena = entrada.nextLine();
        System.out.println("la cadena es: "+cadena);//ejecuta

        char letra;//declara
        System.out.println("digite una letra: ");//guarda cadena con todo y espacio
        letra = entrada.next().charAt(0);
        System.out.println("la letra es: "+letra);//ejecuta
    }
}
