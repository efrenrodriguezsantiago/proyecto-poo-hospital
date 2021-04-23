package seccion13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class _6ventana extends JFrame {
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajatexto;
    private JButton boton;
    private JTextArea areatexto;

    public _6ventana() {
        setBounds(50, 50, 500, 500);//posicion y tamaño de la ventana
        setTitle("eventos");//titulo de la ventana

        iniciarcomponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//que se detenga la ejecucion al cerrar la ventana
    }

    private void iniciarcomponentes() {
        colocarPanel();
        colocarAreaTexto();//desactivamod el diseño del panel
        colocarBoton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);//desactivamos el diseño de panel
        this.add(panel);

        eventoruendadelraton();
    }


    private void colocarAreaTexto() {
        areatexto = new JTextArea();
        areatexto.setBounds(20, 20, 200, 300);
        panel.add(areatexto);

        //le agreagamos un scroll
        JScrollPane scroll = new JScrollPane(areatexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);

    }

    private void colocarBoton() {
        boton = new JButton("pulsa aqui");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial", 0, 15));
        panel.add(boton);

    }

    private void eventoruendadelraton(){
        MouseWheelListener ruedaraton = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
//si movemos la rueda del raton se da cuenta y lo imprime
                if (e.getPreciseWheelRotation() == -1){
                    areatexto.append("rueda hacia arriba\n");
                }
                if (e.getPreciseWheelRotation() == 1){
                    areatexto.append("rueda hacia abajo\n");
                }
            }
        };
        panel.addMouseWheelListener(ruedaraton);
    }
}

