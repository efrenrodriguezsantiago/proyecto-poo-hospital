package seccion13;

import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _2ventana extends JFrame {
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajatexto;
    private JButton boton;

    public _2ventana() {
        setBounds(50, 50, 500, 500);//posicion y tamaño
        setTitle("Eventos");//tiulo de la ventan

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarCajaTexto();
        colocarBoton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("ingrese su nombre");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("cooper black", 0, 18));
        panel.add(etiqueta);
    }

    private void colocarCajaTexto() {
        cajatexto = new JTextField();
        cajatexto.setBounds(30, 50, 300, 30);
        panel.add(cajatexto);
    }

    private void colocarBoton(){
        JButton boton = new JButton("pulsa aqui");
        boton.setBounds(150, 100, 150, 40);//tamaño del boton
        boton.setFont(new Font("arial", 10, 15));//aqui si se marco la letra asi como se encuentra-////////////****///////
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial", 1, 20));
        panel.add(saludo);


    //en esta arte agregamos el evento de tipo Actionlistener de la caja
    ActionListener oyentedeaccion = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saludo.setText("hola "+cajatexto.getText());
        }
        };
        boton.addActionListener(oyentedeaccion);
    }
}
