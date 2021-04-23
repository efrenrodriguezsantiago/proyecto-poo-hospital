package seccion_java_poo.model;

import java.util.Date;

public class apoimentDoctor implements IScheduble{
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date fecha;
    private String hora;

    //metodo constructor


    public apoimentDoctor(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    //geters y seters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora+" hrs. ";
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public void schedule(Date fecha, String hora) {
    this.fecha = fecha;
    this.hora = hora;
    }
}
