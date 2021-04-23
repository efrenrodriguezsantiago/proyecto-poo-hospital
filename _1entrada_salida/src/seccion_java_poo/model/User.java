package seccion_java_poo.model;
//su funcion va a ser super clase ahora sera padre solo los demas l vana a heredar

public abstract class User {//ya se convierte en una clase abstracta
    private int id;
    private String nombre;
    private String email;
    private String direccion;
    private String numero_cel;
    //metodo constructor

    public User(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    //creamos geters y seters de todos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero_cel() {
        return numero_cel;
    }

    public void setNumero_cel(String numero_cel) {
        if (numero_cel.length()>8){
            System.out.println("\ndebes aignar minimo de 8 digitoss maximo");
        }else if (numero_cel.length() == 8){
            this.numero_cel = numero_cel;

        }
    }
//es la sobrescritura de metodos otra forma de comportamiento
    @Override//toString enter--es un metodo extraido de la supeeclase de la clase padre
    public String toString() {
        return "User: "+nombre+" \nemail: "+email+" \ndireccion: "+direccion+" \nnumero telefonico: "+numero_cel;
    }
    //colocaremos un metodo abstracto
    public abstract void Showdatauser();
}
