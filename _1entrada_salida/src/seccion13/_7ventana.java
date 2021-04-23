package seccion13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class _7ventana extends JFrame {
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajatexto;
    private JButton boton;
    private JTextArea areatexto;

    public _7ventana() {
        setBounds(50, 50, 500, 500);//posicion y tamaño de la ventana
        setTitle("eventos");//titulo de la ventana

        iniciarcomponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//que se detenga la ejecucion al cerrar la ventana
    }

    private void iniciarcomponentes() {
        colocarPanel();
        colocarAreaTexto();//desactivamod el diseño del panel
        colocarCajaTexto();
        //colocarBoton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);//desactivamos el diseño de panel
        this.add(panel);


    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("ingrese su nombre");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("cooper black", 0, 18));
        panel.add(etiqueta);
    }
    private void colocartexto() {
        cajatexto = new JTextField();
        cajatexto.setBounds(50, 30, 150, 30);
        panel.add(cajatexto);

    }

    private void colocarCajaTexto() {
        cajatexto = new JTextField();
        cajatexto.setBounds(20, 30, 150, 30);
        panel.add(cajatexto);

        //aqui colocamos el eventoe
        eventodelteclado();
    }


    private void colocarAreaTexto() {//el mas grande
        areatexto = new JTextArea();
        areatexto.setBounds(230, 30, 200, 300);
        panel.add(areatexto);

        //le agreagamos un scroll
        JScrollPane scroll = new JScrollPane(areatexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(230, 30, 200, 300);
        panel.add(scroll);

    }

    private void colocarBoton() {
        boton = new JButton("pulsa aqui");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial", 0, 15));
        panel.add(boton);

    }
    //***************************************************************
    private void eventodelteclado(){
        KeyListener eventoteclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //a-z algun numero o caracter
                areatexto.append("keyTyped\n");

            }

            @Override
            public void keyPressed(KeyEvent e) {
            //presionar cualquier tecla lo escribe
                areatexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //presionar y soltar-------presiona mucho tiempo no ejecuta
                //areatexto.append("keyReleased\n");

                //si le pongo cualquier letra no pasa nada solo estas especificiones
                if (e.getKeyChar() == 'p'){
                    areatexto.append("letra p\n");
                }

                if (e.getKeyChar() == '\n'){
                    areatexto.append("Enter\n");
                }

                if (e.getKeyChar() == ' '){
                    areatexto.append("Espacio\n");
                }

            }
        };

    cajatexto.addKeyListener(eventoteclado);
}



}