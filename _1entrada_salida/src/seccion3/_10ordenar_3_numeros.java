package seccion3;

import javax.swing.*;

public class _10ordenar_3_numeros {
    public static void main(String []args){
//pedir tres numeros y mostrar ordenados de mayor a menor
        int numero1,numero2,numero3;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("digite el tercer numero"));

        if((numero1 > numero2) && (numero2 > numero3)){
            JOptionPane.showInputDialog(null,"orden: "+numero1+" "+numero2+" "+numero3);
        }
        else  if((numero1 > numero3) && (numero3 > numero2)){
            JOptionPane.showInputDialog(null,"orden: "+numero1+" "+numero3+" "+numero2);
        }
        else  if((numero2 > numero1) && (numero1 > numero3)){
            JOptionPane.showInputDialog(null,"orden: "+numero2+" "+numero1+" "+numero3);
        }
        else  if((numero2 > numero3) && (numero3 > numero1)){
            JOptionPane.showInputDialog(null,"orden: "+numero2+" "+numero3+" "+numero1);
        }
        else  if((numero3 > numero1) && (numero1 > numero2)){
            JOptionPane.showInputDialog(null,"orden: "+numero3+" "+numero1+" "+numero2);
        }
        else {
            JOptionPane.showInputDialog(null,"orden: "+numero3+" "+numero2+" "+numero1);
        }
    }
}
