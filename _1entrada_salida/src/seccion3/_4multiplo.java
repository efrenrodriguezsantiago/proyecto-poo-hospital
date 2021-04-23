package seccion3;

import javax.swing.*;

public class _4multiplo {
    public static void main(String []args){
        //hacer un programa que lea un entero y muestre si el numero es multiplo de 10

        int numero = 10;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if(numero%10 == 0 ){
            JOptionPane.showMessageDialog(null,"es un numero multiplo");
        }else{
            JOptionPane.showMessageDialog(null,"no es un numero multiplo");
        }

    }
}
