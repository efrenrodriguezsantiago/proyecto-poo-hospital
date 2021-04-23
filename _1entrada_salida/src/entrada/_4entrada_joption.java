package entrada;

import javax.swing.*;

public class _4entrada_joption {
    public static void main(String []args){

        String cadena;
        int entero;
        char caracter;
        double decimal;

        cadena = JOptionPane.showInputDialog("digite un numero: ");//una cadena
        entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero"));//un entero
        caracter = JOptionPane.showInputDialog("digite un caracter").charAt(0);//guardamos un caracter
        decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimal: "));

        //imprime
        JOptionPane.showMessageDialog(null,"la cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"el entero es: "+entero);
        JOptionPane.showMessageDialog(null,"el caracter es: "+caracter);
        JOptionPane.showMessageDialog(null,"el decimal es: "+decimal);

    }
}
