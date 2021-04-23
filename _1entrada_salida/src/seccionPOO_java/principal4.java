package seccionPOO_java;

public class principal4 {
    public static void main(String[] args) {
        persona p1 = new persona(24,"jose");
        persona p2 = new persona(32,"martin");

        //llamamos a datos desde persona ya que es un metodo que imprime y lo imprime con esto...
        p1.datos();
        p2.datos();
    }
}
