package seccion3;

import javax.swing.*;

public class _6mayuscula {
    public static void main(String []args){
        //programar que lea un caracterpor teclado
        //y compruebe si es una letra mayuscula
        char letra;
        letra = JOptionPane.showInputDialog("digite una letra: ").charAt(0);
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"es una letra mayuscula");
        }else {
            JOptionPane.showMessageDialog(null,"es una letra minuscula");
        }
    }
}
