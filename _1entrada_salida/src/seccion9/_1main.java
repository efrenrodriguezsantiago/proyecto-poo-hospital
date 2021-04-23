package seccion9;

import seccionPOO_java.auto;

import javax.swing.*;

//aqui imprime lo instancia
public class _1main {
    public static void main(String[] args) {
        _1area_cudrado_perimetro c1;

        float lado1,lado2;

        //***********************************
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("digite la lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("digite la lado 2: "));

        if (lado1 == lado2){
            c1 = new _1area_cudrado_perimetro(lado1);
        }
        else {
            c1 = new _1area_cudrado_perimetro(lado1,lado2);
        }

        System.out.println("el perimetro es: "+c1.getPerimetro());
        System.out.println("el area es: "+c1.getArea());
    }
}
