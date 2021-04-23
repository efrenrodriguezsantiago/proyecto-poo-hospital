package seccion_java_poo.model;

public class enfermera extends User{
    //atributos
    private String especialidad;
//metodo constructor
    public enfermera(String nombre, String email){
        super(nombre,email);

    }

    @Override
    public void Showdatauser() {
        System.out.println("empleado hospital: cruz verda");
        System.out.println("departamento: nutriologia");
        System.out.println("departamento: operacion");
    }

    //geters y seters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
