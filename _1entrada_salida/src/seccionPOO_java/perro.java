package seccionPOO_java;
public class perro {
    //atributos
    public int ID;
    public String raza;
    public int precio;
//es el metodo constructor
    public perro(int ID, String raza, int precio) {
        this.ID = ID;
        this.raza = raza;
        this.precio = precio;
    }
    //acciones y comportamientos o metodo
    public void sano(){
        System.out.println("sano");
    }

    public void datos(){
        System.out.println("id: "+ID);
        System.out.println("raza: "+raza);
        System.out.println("precio: "+precio);
    }
}
