package seccion_java_poo.ui;

import seccion_java_poo.model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showpatientmenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("patient");
            System.out.println("welcome: "+UImenu.patientLogged.getNombre());
            System.out.println("1.libro de citas");
            System.out.println("2. mis citas");
            System.out.println("0. logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookApoimentMenu();
                    break;
                case 2:
                    showpaientmyapoiments();
                    break;
                case 0:
                    UImenu.showMenu();
                    break;

            }


        }while (response != 0);
    }
    private static void showBookApoimentMenu(){
        int responsive = 0;
        do {
            System.out.println("::Book an apoinment ");
            System.out.println(":: selecciona la fecha: ");
//aqui va a mostrar las fechas de doctores que agendaron
            //fecha selleciionada
            //doctors
            //doctor1
            //doctor2
            Map<Integer,Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsavailableapoiments.size(); i++) {
                ArrayList<Doctor.availableapoinment>availableapoinments
                        =UIDoctorMenu.doctorsavailableapoiments.get(i).getAvailableapoinments();
                Map<Integer,Doctor> doctorapiments = new TreeMap<>();

                for (int j = 0; j < availableapoinments.size(); j++) {
                    k++;
                    System.out.println(k+" . "+availableapoinments.get(j).getFecha());
                    //es para estar capturando el indice fecha y doctor fecha seleccionado
                    doctorapiments.put(Integer.valueOf(j),UIDoctorMenu.doctorsavailableapoiments.get(i));
                    doctorapiments.put(Integer.valueOf(k), (Doctor) doctorapiments);
                }
            }
            //aqui empezamos a manejar las respuestas
            Scanner sc = new Scanner(System.in);
           int responsedateselect = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctoravailableseleted = doctors.get(responsedateselect);
            Integer indexDate = 0;
            Doctor doctorselected = new Doctor("","");

            for (Map.Entry<Integer,Doctor> doc :doctoravailableseleted.entrySet()){
            indexDate = doc.getKey();
            doctorselected = doc.getValue();
            }
            System.out.println(doctorselected.getNombre()+
                    ". fecha: "+
                    doctorselected.getAvailableapoinments().get(indexDate).getFecha()+
                    ".hora: "+
                    doctorselected.getAvailableapoinments().get(indexDate).getHora());

            System.out.println("confirma tu cita: \n1. si \n2. change data");
            responsive = Integer.valueOf(sc.nextLine());

            //**************
            if (responsive == 1){
                UImenu.patientLogged.addApoimentDoctors(
                        doctorselected,
                        doctorselected.getAvailableapoinments().get(indexDate).getFecha(null),
                        doctorselected.getAvailableapoinments().get(indexDate).getHora());
                showpatientmenu();
            }


        }while (responsive != 0);
    }

    //**********************
    private static void showpaientmyapoiments(){
        int response = 0;
        do {
            System.out.println("::my apoiments ");
            if (UImenu.patientLogged.getApoimentDoctors().size() == 0){
                System.out.println("no tienes cita");
                break;
            }
            for (int i = 0; i < UImenu.patientLogged.getApoimentDoctors().size(); i++) {
                int j = i +1;
                System.out.println(j+" . "+
                        "fecha"+UImenu.patientLogged.getApoimentDoctors().get(i).getFecha()+
                        "hora "+UImenu.patientLogged.getApoimentDoctors().get(i).getHora()+
                        "\n Doctor: " +UImenu.patientLogged.getApoimentDoctors().get(i).getDoctor().getNombre()
                );

            }
            System.out.println("0. salir");
        }while (response !=0);
    }
}
