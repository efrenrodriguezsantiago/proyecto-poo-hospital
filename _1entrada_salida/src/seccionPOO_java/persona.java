package seccionPOO_java;

public class persona {
    //atibutos no le ponemos nombre ni edad ya que en principal lo hacemos lo llamammos para impprimirlos
    int edad;
    String nombre;
    //metodo constructor

    public persona(int edad, String nombre) {
        this.edad = edad;//this es para llamar edad de edad paranombre
        this.nombre = nombre;
    }

    //metodo para visualizar un constructor********************************************
    public void datos(){
        System.out.println("edad: "+edad+" nombre: "+nombre);
    }
}
