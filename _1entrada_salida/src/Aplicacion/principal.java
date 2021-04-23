package Aplicacion;

import javax.swing.*;

public class principal extends javax.swing.JFrame {

    public static void main(String []args){
        //una vez instaciado se imprime
        sistemahospital v1 = new sistemahospital();//imprime la ventana
        consulta v2 = new consulta();
        registro v3 = new registro();
        //imprime la venta en regstro es como se invierte la forma de imprimir
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
    }
}
