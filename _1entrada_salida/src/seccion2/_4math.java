package seccion2;

public class _4math {
    public static void main(String []args){

        //sacar la raiz cuadrada de un numero a double
        double raiz = Math.sqrt(9);
        System.out.println(raiz);

        //sacar la raiz cuadrada de un numero a entero
        int raizs = (int)Math.sqrt(36);
        System.out.println(raizs);

        //elevarlo a la potencia
        double base = 5,exponente = 2;
        double resultado = Math.pow(base,exponente);
        System.out.println(resultado);

        //redondear un numero
        double numer = 4.56;
        long result = Math.round(numer);
        System.out.println(result);


        //redondear un numero con float
        float numeros = 6.30f;
        int resultados= Math.round(numeros);
        System.out.println(resultados);


        //random numero aleatorio
        double aleatorio = Math.random();
        System.out.println(aleatorio);

    }
}
