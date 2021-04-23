package seccion13;

public class _1persona {
    private String nombre;
    private int edad;
    private String nacionalidad;
//creamos el metodo constructor
    public _1persona(String nombre,int eada,String nacionalidad){
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
    //creamos el metodo geter y seters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //parecido al de mostrar datos aui lo que hace es sobreescribir ya n sale cosas raras sale mi nonmbre efren


    @Override
    public String toString() {
        return this.nombre;
    }
}
