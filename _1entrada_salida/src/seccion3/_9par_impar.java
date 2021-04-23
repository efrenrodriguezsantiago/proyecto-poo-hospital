package seccion3;

import javax.swing.*;

public class _9par_impar {
    public static void main(String []args){
        //hacer un programa que tome dos numeros y diga si ambos son pares o impares
        int numero1,numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero"));

        if((numero1%2 == 0)&&(numero2%2==0)){
        JOptionPane.showInputDialog(null,"ambos son ppares");
        }
        else if((numero1%2 != 0)&&(numero2%2 != 0)){
            JOptionPane.showInputDialog(null,"ambos son impares");
        }
        else {
            JOptionPane.showInputDialog(null,"uno es par y  el otro no es impar");
        }
    }
}
