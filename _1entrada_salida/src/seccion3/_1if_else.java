package seccion3;

import javax.swing.*;
import java.util.Scanner;

public class _1if_else {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        int numero,dato=5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        //numero != dato---si es diferente
        //numero < dato
        //numero > dato
        //numero == dato
        if(numero == dato){
            JOptionPane.showMessageDialog(null,"es 5");
        }else{
            JOptionPane.showMessageDialog(null,"es diferente de 5");
        }
    }
}
