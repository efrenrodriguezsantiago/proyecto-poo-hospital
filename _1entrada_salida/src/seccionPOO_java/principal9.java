package seccionPOO_java;
//tema de polimorfismo
public class principal9 {
    public static void main(String[] args) {
        //geramos nestro objeto
        fruta nueva_fruta = new fruta();
        //subclase manzana
        fruta manzana = new manzana();
        //subclase fruta
        fruta platano = new platano();
        //**************************************
        //imprimimos frutas tropicales llamando desde susblcases
        nueva_fruta.color_fruta();
        manzana.color_fruta();
        platano.color_fruta();
    }
}
