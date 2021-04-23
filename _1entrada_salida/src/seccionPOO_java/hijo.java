package seccionPOO_java;

class hijo extends padre{//extends es hereda de la clase pader dentro de la clase hijo
    private String nombre_hijo = "sergio";

    public static void main(String[] args) {
        //aqui creamos las siguente nomenclatura
        hijo nuevo_hijo = new hijo();
        //aqui ejecuta lo hecho
        nuevo_hijo.saluda();
        //imprime con sout
        System.out.println("tu hijo: "+nuevo_hijo.nombre_hijo);
        System.out.println("tu padre: "+nuevo_hijo.nombre_padre);//puedo llamarlo desde aqui
    }
}

