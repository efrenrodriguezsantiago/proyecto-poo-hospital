package seccionPOO_java;

public class principal {
//estos lo heredan de clase pade que es perro y aqui se ejecutan
    public static void main(String[] args) {//escribir main para generar

        perro perro1 = new perro(101,"doberman",5000);

        perro1.sano();
        perro1.datos();
        System.out.println("**************************************************************");
        perro perro2 =  new perro(102,"pug",3000);
        perro2.sano();
        perro2.datos();
    }
}
