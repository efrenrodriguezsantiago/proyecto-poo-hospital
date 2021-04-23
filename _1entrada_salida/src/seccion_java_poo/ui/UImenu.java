package seccion_java_poo.ui;

import seccion_java_poo.model.Doctor;
import seccion_java_poo.model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UImenu {
    //creamos el mes
    public static final String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Nomviembre","Diciembre"};
    //declaramos una variable mas global de tipo statica
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    //******es un codigo
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }//hayq eu ponerlo su keword publico para que funcione

    //creamos un metodo autw
    private static void authUser(int usertype){
        //si usuario1 es doctor
        //si usuario 2 es paciente
        ArrayList<Doctor> doctors= new ArrayList<>();
        doctors.add(new Doctor("alejandro martinez","alejandro@gmail.com"));
        doctors.add(new Doctor("karen sosa","karen@gmail.com"));
        doctors.add(new Doctor("rocio gommez","rocio@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("jose salgado","salgado@gmail.com"));
        patients.add(new Patient("roberto rodriguez","roberto@gmail.com"));
        patients.add(new Patient("carlos sanchez","carlos@gmail.com"));
//es para verificar el correo electronico qu eya tengo defnidos
        boolean emailCorrecto = false;
        do {
            System.out.println("inserta tu email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (usertype == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrecto = true;
                        //obtenerel usuario logeado
                        doctorLogged =d;
                        UIDoctorMenu.shoedoctormenu();
                    }
                }

            }
            if (usertype == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrecto = true;
                        //obtenerel usuario logeado
                        patientLogged =p;
                        //es lo ultimo es para imprimirlo
                        UIPatientMenu.showpatientmenu();
                    }
                }
            }

        }while (emailCorrecto);

    }


    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    //nos muestra la lista de los 3 primeros meses
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i+"."+meses[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }


}
