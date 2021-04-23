package seccionPOO_java;

public class alumns {
    //PARA ACCEDER EL PRIVADO TENEMOS QUE HACER EL METODO CONSTRUCTOR MAS UN METODO PARA ACCEDER AL PRIVADO DESDE OTRA CLASE
    //atributo
    private String nombres;
    private int edads;

//metodo constructor
    public alumns(String nombres, int edads) {
        this.nombres = nombres;
        this.edads = edads;

    }

    //va a ejecutar el nombre y la edad desde la clase principal
    public void resuesta(){
        System.out.println("nombre: "+this.nombres+" edad: "+edads);
    }
    //****************************************************************METODO STATIC**************************************************
    public static alumns mayor(alumns alum1,alumns alum2){
        //operacion
        if(alum1.edads >= alum2.edads){
            return alum1;
        }
        else{
            return alum2;
        }
    }

    //************************************************************************************************************************

}
