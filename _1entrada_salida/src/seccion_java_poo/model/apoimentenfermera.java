package seccion_java_poo.model;

import java.util.Date;

public class apoimentenfermera implements IScheduble{
    //atributos
    private int id;
    private enfermera Enfermera;
    private Patient patient;
    private Date fecha;
    private String hora;
    //geters y sters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public enfermera getEnfermera() {
        return Enfermera;
    }

    public void setEnfermera(enfermera enfermera) {
        Enfermera = enfermera;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    @Override
    public void schedule(Date date, String time) {

    }
}
