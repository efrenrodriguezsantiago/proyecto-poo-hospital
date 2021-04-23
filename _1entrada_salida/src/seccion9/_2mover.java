package seccion9;
/*
construir un programa que permita dirigir el movimietno de un objeto dentro de un tablero
y actualice su posicion dentro del mismo
los movimietnos son arriba   abajo   izquierda   derecha
tras cada movimiento el programa mostrara la nueva direccion elegida y las cordenadas de situacion
del objeto dentro del tablero
 */
public class _2mover {
    //atributos
    private int x;
    private int y;
    //metodo constructor

    public _2mover(int x, int y) {
        this.x = x;
        this.y = y;
    }
//posiciones
    public void moverarriba(int incremento){
        y += incremento;
    }

    public void moverabajo(int incremento){
        y -= incremento;
    }

    public void moverderecha(int incremento){
        x += incremento;
    }
    public void moverizquierda(int incremento){
        x -= incremento;
    }

    //metodos geters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
