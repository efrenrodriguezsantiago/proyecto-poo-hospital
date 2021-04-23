package seccion13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _8clics extends JFrame {
    private JPanel panel;
    private JLabel clic;
    private JTextField cajatexto;
    private JButton boton;
    private int contar = 0;

    public _8clics() {
        setBounds(50, 50, 500, 500);//posicion y tamaño
        setTitle("Eventos");//tiulo de la ventan

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarBoton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }





    private void colocarBoton(){
        boton = new JButton("clic aqui");
        boton.setBounds(165, 300, 150, 40);//tamaño del boton
        boton.setFont(new Font("arial", 10, 15));//aqui si se marco la letra asi como se encuentra-////////////****///////
        panel.add(boton);

        clic = new JLabel();
        clic.setBounds(50, 200, 300, 40);
        clic.setFont(new Font("arial", 1, 20));
        panel.add(clic);

        eventodeaccion();
    }

    private void eventodeaccion(){

        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contar++;
                if (contar == 1){
                    clic.setText("haz presionado el boton 1 vez");
                }
                else {
                    clic.setText("has presionado el boton contadoor "+contar+" veces");
                }
            }
        };

        boton.addActionListener(evento);//************
    }
}
