package seccion3;

import javax.swing.*;

public class _5numero_mayor_o_igual {
    public static void main(String []args){
        //pedir dos numeros y decir cual es el mayor o si son iguales
        int numero1,numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero"));

        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null,"numero 1 es mayor"+numero1);
        }
        else if(numero2>numero1){
            JOptionPane.showMessageDialog(null, "numero 2 es mayor"+numero2);
        }
        else{
            JOptionPane.showMessageDialog(null, "los numeros son iguales");
        }
    }
}
