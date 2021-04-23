package seccion3;

import javax.swing.*;

public class _3operador_ternraio {
    public static void main(String []args){
        int numero;
        String mensaje;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        mensaje = (numero%2==0) ? "es par" : "es impar";//es un operador ternario
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
