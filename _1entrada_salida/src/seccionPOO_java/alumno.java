package seccionPOO_java;

public class alumno {
    /*
    publico accede desde cualquier clase pueden acceder el privado no puede acceder desde cualquier cosa
    si no desde la misma clase
     */

    //atributos
    public String nombre = "victor";//si se puede acceder desde principal
    private int edad = 12;//modificador privado no se puede acceder desde principal2

    public static void main(String[] args) {

        alumno alumno1 = new alumno();
        System.out.println("edad: "+alumno1.edad);//imprime el 12 porque esta en la misma clase de manera interna
    }

}
