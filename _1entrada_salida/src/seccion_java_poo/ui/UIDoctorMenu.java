package seccion_java_poo.ui;

import seccion_java_poo.model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsavailableapoiments = new ArrayList<>();

    public static void shoedoctormenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("bienvenido "+UImenu.doctorLogged.getNombre());
            System.out.println("1. Add available apoiment");
            System.out.println("2. my schedulable apoiments");
            System.out.println("3. logott");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddvilableapoiment();
                    break;
                case 2:
                    break;
                case 0:
                UImenu.showMenu();
                break;
            }

        }while (response != 0);
    }
    //+++++++++++++++++++++++++++++++++++++++los titulos de los metods sean lo mas descriptibles que sean posibles
    private static void showAddvilableapoiment(){
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Add available apoiment");
            System.out.println(":: select a Month");
//es de los primeros tres meses
            for (int i = 0; i <3 ; i++) {
                int j = i + 1;
                System.out.println("0. return");
                //++++++++++++++++++
                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                if (response > 0 && response < 4){
                    //1,2,3
                    int seleccionames = response;
                    System.out.println(seleccionames+" . "+UImenu.meses[seleccionames-1]);

                    System.out.println("inserta la fecha de citas [dd/mm/yyyy]");
                    String fecha = sc.nextLine();

                    System.out.println("tus dtos son: "+fecha+" \n1. correcto \n2. change date");
                    int responsiveDate = Integer.valueOf(sc.nextLine());
                    if (responsiveDate == 2)continue;

                    int responsiveTime = 0;

                    //es la hora de la citas
                    String hora = "";

                    do {
                        System.out.println("inserta los datos de la cita: "+fecha+" [16:00] ");
                        hora = sc.nextLine();
                        System.out.println("tus horario de cita es: "+hora+" \n1. correcto \n2. change time");

                    }while (responsiveTime == 2);

                    //es la fecha donde vamos a ir a ajustar
                    UImenu.doctorLogged.addvailableapoiment(fecha,hora);
                    checkdoctoravailableapoiments(UImenu.doctorLogged);
                }
                else if (response == 0){
                    shoedoctormenu();
                }
            }
            
        }while (response != 0);

    }
    //creamos un nuevo metodo para modularizarlos
    private static void checkdoctoravailableapoiments(Doctor doctor){
        if (doctor.getAvailableapoinments().size()>0
            && !doctorsavailableapoiments.contains(doctor)){
        doctorsavailableapoiments.add(doctor);
        }
    }
}
