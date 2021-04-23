package seccionPOO_java;

public class principal6 {
    public static void main(String[] args) {

        arroz arroz_nuevo = new arroz();
        //llamamos al objeo por su nombre
        arroz_nuevo.setMarca("grano de oro");
        arroz_nuevo.setPeso(100);//es en gramos

        //imprimimos es resultado
        System.out.println(arroz_nuevo.getMarca()+" peso en gramos "+arroz_nuevo.getPeso());
        System.out.println(arroz_nuevo.getMarca()+" peso en kg "+arroz_nuevo.getpesokg());

    }
}
