package seccion13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class _5ventana extends JFrame {
        private JPanel panel;
        private JLabel saludo;
        private JTextField cajatexto;
        private JButton boton;
        private JTextArea areatexto;

        public _5ventana(){
            setBounds(50,50,500,500);//posicion y tamaño de la ventana
            setTitle("eventos");//titulo de la ventana

            iniciarcomponentes();

            setDefaultCloseOperation(EXIT_ON_CLOSE);//que se detenga la ejecucion al cerrar la ventana
        }

        private void iniciarcomponentes(){
            colocarPanel();
            colocarAreaTexto();//desactivamod el diseño del panel
            colocarBoton();
        }
        private void colocarPanel() {
            panel = new JPanel();
            panel.setLayout(null);//desactivamos el diseño de panel
            this.add(panel);

            eventodemovimientoderaton();
        }


        private void colocarAreaTexto(){
            areatexto = new JTextArea();
            areatexto.setBounds(20,20,200,300);
            panel.add(areatexto);

            //le agreagamos un scroll
            JScrollPane scroll = new JScrollPane(areatexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setBounds(20,20,200,300);
            panel.add(scroll);

        }
        private void colocarBoton(){
            boton = new JButton("pulsa aqui");
            boton.setBounds(150,350,150,40);
            boton.setFont(new Font("arial",0,15));
            panel.add(boton);

    }
    //evento del movimiento del raton
    private void eventodemovimientoderaton(){
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //si doy clic y los muevo ejecuta
                areatexto.append("mouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //si solo lo muevo ejecuta
                //se va aejecutar siempre en cuanto se ejecuta el panel
                areatexto.append("mouseMoved\n");
            }

        };
        //agregamos un evento
        panel.addMouseMotionListener(oyenteMovimientoRaton);
    }

}
