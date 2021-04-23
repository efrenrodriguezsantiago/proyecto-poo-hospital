package seccionPOO_java;

public class principal7 {
    public static void main(String[] args) {
        clase_externa obj_externo = new clase_externa();
        //desde la clase externa llamamos la clase interna
        clase_externa.clase_interna obj_interno = obj_externo.new clase_interna();
        //imprimimos el valor de y interno y externo
        System.out.println(obj_interno.y + obj_externo.x);
    }
}
