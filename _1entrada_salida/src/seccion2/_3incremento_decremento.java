package seccion2;

public class _3incremento_decremento {
    public static void main(String []args){

        //decremento
        int x = 5;
        x++;
        System.out.println("el numero incremento a: "+x);

        //incremento
        int y = 5;
        y--;
        System.out.println("el numero decremento a: "+y);

        //******************************solamente asi se puede incrementar***************************************
        int a = 5, b;

        b = ++a;//solamente asi se puede utilizar de otr manera no

        System.out.println(b);
        System.out.println(a);

    }
}
