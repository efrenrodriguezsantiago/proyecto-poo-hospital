package seccion3;

import javax.swing.*;

public class _7descuento_300 {
    public static void main(String []args){
        //en mega plaza se hace un 20% de descuentoa los clientes cuya  compra supere los 300 dolares
        //cual sera la cantidad que pagara una personapor su compra
        float descuento,cliente,compra,total;

        compra = Integer.parseInt(JOptionPane.showInputDialog("digite el total de compra"));
        if (compra > 300){
            JOptionPane.showMessageDialog(null,"felicidades tiene descuento del 20 %");
            descuento = (compra*0.20f);
            compra -= descuento;
            JOptionPane.showMessageDialog(null,"el producto total es: "+compra);
        }else {
            JOptionPane.showMessageDialog(null,"no tiene descuento del 20 %");
            JOptionPane.showMessageDialog(null,"el producto total es: "+compra);
        }
    }
}
