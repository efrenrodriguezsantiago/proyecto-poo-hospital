package seccion13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class _3ventana extends JFrame {
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajatexto;
    private JButton boton;
    private JTextArea areatexto;

    public _3ventana(){
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
    }

    private void colocarAreaTexto(){
    areatexto = new JTextArea();
    areatexto.setBounds(20,20,200,300);
    panel.add(areatexto);
    }

    private void colocarBoton(){
        boton = new JButton("pulsa aqui");
        boton.setBounds(150,350,150,40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);

        eventoOyenteDeRaton();
    }

        private void eventoOyenteDeRaton() {
            //agregando oyente de Raton -   Mouselistener
        MouseListener oyenteDeRaton = new MouseListener () {

            @Override
            public void mouseClicked(MouseEvent e) {
            areatexto.append("mouseClicked\n");//cada vez que aga clicl se copia y aparece en el cuadro de texto
            }

            @Override
            public void mousePressed(MouseEvent e) {
                areatexto.append("mousePressed\n");//al presionar ya se esta ejecunatdo
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                areatexto.append("mouseReleased\n");//presionar y soltar fuera se puede
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                areatexto.append("mouseEntered\n");//solamente entrar en el boton con eso entra da clic sin preionar boton
            }

            @Override
            public void mouseExited(MouseEvent e) {
                areatexto.append("mouseExited\n");//si le paso y salgo autmaticamente se escribe en el texto
            }


        };
        boton.addMouseListener(oyenteDeRaton);
    }

}
