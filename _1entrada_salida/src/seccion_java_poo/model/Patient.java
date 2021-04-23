package seccion_java_poo.model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{
        //Atributos

        private String fecha_nac;
        private double peso;
        private double altura;
        private String sangre;

        //**********************metodo constructor
    private ArrayList<apoimentDoctor> apoimentDoctors = new ArrayList<>();
    private ArrayList<apoimentenfermera> apoimentenfermeras = new ArrayList<>();
    //aqui le colocamos sus geters y sus seters


    public ArrayList<apoimentDoctor> getApoimentDoctors() {
        return apoimentDoctors;
    }

    public void addApoimentDoctors(Doctor doctor, Date fecha,String hora) {
        apoimentDoctor apoimentDoctor = new apoimentDoctor(this, doctor);
        apoimentDoctor.schedule(fecha,hora);
        apoimentDoctors.add(apoimentDoctor);
    }

    public ArrayList<apoimentenfermera> getApoimentenfermeras() {
        return apoimentenfermeras;
    }

    public void setApoimentenfermeras(ArrayList<apoimentenfermera> apoimentenfermeras) {
        this.apoimentenfermeras = apoimentenfermeras;
    }

    //metodo constructor cargado de definir parametors obligatoriso
        public Patient(String nombre, String email){//alt + enter
            super(nombre,email);//es de la clase padre
            //mas instrucciones con overrride sobreescribimos y le añadimos mas comportamientos a ese metodo
        }

        //****************************************** validad todo dato que se aigna
        public void setPeso(double peso){
            this.peso = peso;
        }
        public String getPeso(){
            return this.peso+" kg";
        }


    public String getAltura() {
        return altura+" mts.";
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
//

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    @Override
    public String toString() {
        return super.toString()+"\nfecha de nacimiento: "+fecha_nac+"\npeso: "+peso+" kg "+"\nestatura: "+altura+"\ntipo sangre: "+sangre;
    }
//no es empleado es paciente
    @Override
    public void Showdatauser() {
        System.out.println("paciente");
        System.out.println("historial completo nacimiento");

    }
}
