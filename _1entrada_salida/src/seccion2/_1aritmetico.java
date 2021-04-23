package seccion2;

import java.util.Scanner;

public class _1aritmetico {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        float numero1,numero2,suma,resta,multiplicacion,division,resto;

        System.out.println("digite el numero: ");
        numero1 = entrada.nextFloat();
        System.out.println("digite el segundo numero: ");
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la division es: "+division);
        System.out.println("el resto es: "+resto);

    }
}
