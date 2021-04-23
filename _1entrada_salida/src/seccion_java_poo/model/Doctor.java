package seccion_java_poo.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //creamos los atributos

    private String especialidad;
    private ArrayList<availableapoinment> availableapoinments = new ArrayList<>();

    //creamos los metodos

    public Doctor(String nombre, String email){
        super(nombre,email);
    }

//geters y seters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //estamos creando coleccion

    public void addvailableapoiment(String fecha, String hora){
    availableapoinments.add(new availableapoinment(fecha, hora));
    }

    public ArrayList<availableapoinment> getAvailableapoinments(){
        return availableapoinments;
    }
//segunda parte la primera es de abajo
    @Override
    public String toString() {
        return super.toString()+"E\nspecialidad: "+especialidad+" \ncita disponible: "+availableapoinments.toString();

    }

//es para metodo
    @Override
    public void Showdatauser() {
        System.out.println("hospital: cruz roja");
        System.out.println("departamento: cancerologia");
        System.out.println("departamento: pediatria");

    }

    //es una clase independiende
    public static class availableapoinment {
    //definimos mas arametor
    private int id_available;
    private Date fecha;
    private String hora;
    //formatea fecha y trabaja con fechas
        SimpleDateFormat formatear = new SimpleDateFormat("dd/MM/yyyy");

    //constructor
    public availableapoinment(String fecha, String hora) {
        try {
            this.fecha = formatear.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.hora = hora;
    }
    //geters y seters

    public int getId_available() {
        return id_available;
    }

    public void setId_available(int id_available) {
        this.id_available = id_available;
    }

    public Date getFecha(String FECHA) {
        return fecha;
    }

    //vamos a sobrecargar el metodo
    public String getFecha() {
        return formatear.format(fecha);
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }//aqui vamos a sobrescribit en toString

    @Override
    public String toString() {
        return super.toString()+"\ncitas fecha:  "+fecha+"\nhora: "+hora;

        }
    }
}
