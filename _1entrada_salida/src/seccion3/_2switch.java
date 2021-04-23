package seccion3;

import javax.swing.*;

public class _2switch {
    public static void main(String []args){

        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entero entre 1-5: "));
        switch (dato){
            case 1: JOptionPane.showMessageDialog(null,"es el numero 1 ");
            break;
            case 2: JOptionPane.showMessageDialog(null,"es el numero 2 ");
            break;
            case 3: JOptionPane.showMessageDialog(null,"es el numero 3 ");
            break;
            case 4: JOptionPane.showMessageDialog(null,"es el numero 4 ");
            break;
            case 5: JOptionPane.showMessageDialog(null,"es el numero 5 ");
            break;
            case 6: JOptionPane.showMessageDialog(null,"no esta el rango de 1 a 5");
        }
    }
}
