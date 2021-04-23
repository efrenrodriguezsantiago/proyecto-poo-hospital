package seccionPOO_java;

public class principal2 {
    public static void main(String[] args) {//es un metodo de declaracion
        final double pi = 3.141516;

            principal2 pic = new principal2();
            System.out.println("el pi es: "+pic);


        alumns alu1 = new alumns("jose",13);//generacmos los datos del objeto
        //llamar objeto por su nombre para que pueda imprimirlo
        alu1.resuesta();

        alumns alu2 = new alumns("marco",28);//generacmos los datos del objeto
        //llamar objeto por su nombre para que pueda imprimirlo
        alu2.resuesta();

        //va a hacer el uso de metodo objeto
        alumns alumno_mayor = alumns.mayor(alu1,alu2);//lamamos metodos static mayr---llamamos objeto alu1 y alu2
        System.out.println("alumno con mayor edad: ");
        alumno_mayor.resuesta();
    }

}
